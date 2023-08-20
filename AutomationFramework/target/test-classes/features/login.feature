Feature: Validate Login funtionality
@Reg
Scenario: Verify Successful login with Valid Details
Given user launch site url
Given user enter username and pasword
And user click on login button
Then validate user logged in succesfully 