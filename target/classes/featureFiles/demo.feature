Feature: marriott website

Scenario: load marriott website and click ourbrand

Given Initialize the Browser 
When click on our brands 
Then verify if the JWMarriott is listed or not

Scenario: load marriott website and search hotel
Given Initialize the Browser
When enter "coimbatore" destination 
And click on the find hotels
Then verify destination entered is correct or not along with the address of hotel

Scenario: load marriott website and check mariott benifits

Given Initialize the Browser
When Click on Member Benifits under Marriot Bonvoy module.  
Then verify if the Mobile Check-In and Mobile Ke is present in benifit page or not

