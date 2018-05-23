package example

import com.amazonaws.auth.{AWSStaticCredentialsProvider, BasicAWSCredentials, EnvironmentVariableCredentialsProvider}
import com.amazonaws.regions.{Region, Regions}
import com.amazonaws.services.sqs.AmazonSQSClientBuilder




object SQSShowResult extends App {
    // use SQS for debug
    private val QUEUE_NAME: String = "pepperSQSTest"
    val AWS_ACCESS_KEY_ID = System.getenv("AWS_ACCESS_KEY_ID")
    val AWS_SECRET_ACCESS_KEY = System.getenv("AWS_SECRET_ACCESS_KEY")
    val basicCredentials = new BasicAWSCredentials(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY)
    //val derivedRegion:Regions =  Region.getRegion(Regions.AP_SOUTHEAST_2)

    val sqs = AmazonSQSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basicCredentials)).withRegion(Regions.AP_SOUTHEAST_2).build
      //sqs.setRegion(derivedRegion)

  import com.amazonaws.auth.AWSStaticCredentialsProvider
  import com.amazonaws.auth.BasicAWSCredentials
  import com.amazonaws.auth.AWSCredentials
  import com.amazonaws.auth.BasicAWSCredentials


    try {
    import com.amazonaws.services.sqs.model.CreateQueueResult
    val create_result = sqs.createQueue(QUEUE_NAME)
  } catch  {
    case _: Throwable => println("some exception in sqs.createQueue")
  }
    val queueUrl = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl

  //----
  val messages = sqs.receiveMessage (queueUrl).getMessages
  messages match {
    case list: List[String] => list.map(
          message => println(message)
      )
    case _ => println("error")
  }


}


