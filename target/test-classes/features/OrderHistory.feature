Feature: Order T-Shirt and Verify in Order History

Scenario: Customer is able to order a T-Shirt and verify in Order History

Given I am logged in as a Customer
Given I click 'TSHIRTS' link 
Given I added a TShirt to my shopping cart 
Given I confirmed my delivery address 
Given I confirmed my shipping option and agreed to Terms of service 
When I confirm my payment method
Then Order Confirmation is displayed
And I click 'ORDER HISTORY AND DETAILS' link
Then Order is displayed in Order History






