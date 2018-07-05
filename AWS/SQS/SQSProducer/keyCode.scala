

    val QUEUE_NAME: String = "pepperSQSTest"
    val AWS_ACCESS_KEY_ID = System.getenv("AWS_ACCESS_KEY_ID")
    val AWS_SECRET_ACCESS_KEY = System.getenv("AWS_SECRET_ACCESS_KEY")
    val basicCredentials = new BasicAWSCredentials(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY)
    val sqs = AmazonSQSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basicCredentials)).withRegion(Regions.AP_SOUTHEAST_2).build
    try {
      import com.amazonaws.services.sqs.model.CreateQueueResult
      val create_result = sqs.createQueue(QUEUE_NAME)
    } catch  {
      case _: Throwable => println("some exception in sqs.createQueue")
    }
    val queueUrl = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl


    //////////////////sned message using batch
    println("--==--==--=--==--==-==--==--==--==begin to print result_opportunityQuery")
    result_opportunityQuery.map{
      data => {
        val dataList = data.toList
        dataList.map(
          item => {
              val send_batch_request:SendMessageBatchRequest =
              new SendMessageBatchRequest().withQueueUrl(queueUrl).withEntries(
                new SendMessageBatchRequestEntry("result_opportunityQuery", item.toString).withDelaySeconds(10)
              )
            sqs.sendMessageBatch(send_batch_request)
          }
        )
      }
    }

    ////////////////////////////////////////send message one by one
    val xxxxxxxTableQuery = xxxxxxxTable.filter(ie => ie.opportunity_C === request.body.Opportunity__c_al)
    val result_xxxxxxxTableQuery  = dbSFTestConnection.run(xxxxxxxTableQuery.result)
    Await.result(xxxxxxxTableQuery, 20.seconds)
    result_xxxxxxxTableQuery.map( data => {
      val dataList = data.toList
      dataList.map(
        item => {
          import com.amazonaws.services.sqs.model.SendMessageRequest
          sqs.sendMessage(new SendMessageRequest(queueUrl, item.toString))
          println(item.toString)
        }
      )
    }
    )