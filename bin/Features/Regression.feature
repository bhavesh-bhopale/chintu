Feature:Regression testing
Scenario:Login functionality with invalid data.
Scenario outline
|Uname|Password|
|Bhavesh|Bhavesh@123|

Given Chrome browser is opened
And Open the <url>
When User enters wrong <Uname> and <password>
Then  User will get an error message