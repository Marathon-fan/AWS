{
  "Comment": "My test to prove passing parameters between Lambdas",
  "StartAt": "Step1Test",
  "States": {
    "Step1Test": {
      "Type": "Task",
      "Resource": "arn:aws:lambda:ap-southeast-2:john.zhou:function:Step1Test",  // input the arn
      "Next": "Step2Test"
    },
      "Step2Test": {
      "Type": "Task",
      "Resource": "arn:aws:lambda:ap-southeast-2:john.zhou:function:Step2Test",  // input the arn
      "End": true
 }
  }
}