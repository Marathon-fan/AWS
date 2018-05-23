package example

import com.amazonaws.auth.{AWSStaticCredentialsProvider, BasicAWSCredentials, EnvironmentVariableCredentialsProvider}
import com.amazonaws.regions.{Region, Regions}
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import com.amazonaws.services.sqs.model.Message


object SQSShowResult extends App {
    // use SQS for debug
    private val QUEUE_NAME: String = "pepperSQSTest"
    val AWS_ACCESS_KEY_ID = System.getenv("AWS_ACCESS_KEY_ID")
    val AWS_SECRET_ACCESS_KEY = System.getenv("AWS_SECRET_ACCESS_KEY")
    val basicCredentials = new BasicAWSCredentials(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY)
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
    case list: com.amazonaws.internal.SdkInternalList[Message] => list.toArray.toList.foreach(
          message => {
            println()
            println()
            println(message)
          }
      )
    case x: Any => println("error + " + x.getClass.toString)
  }


}


