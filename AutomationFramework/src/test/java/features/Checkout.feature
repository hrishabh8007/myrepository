Feature: Validate checkout functionlity
@Reg
Scenario: validate checkout with valid details
Given user launch site url
Given user enter username and pasword
And user click on login button
And user add product into the basket from PLP page
And user navigate to BasketPage  
And user enter information "Rishabh""Shukla""230204"