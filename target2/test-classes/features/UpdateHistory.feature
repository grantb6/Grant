Feature: Update Personal Information (First Name) in My Account

Scenario: Customer is able to change their First name

Given I am logged in as a Customer
When I click 'MY PERSONAL INFORMATION' link 
And I update my first name to "AndyB" and enter Current Password as "Selenium123"
And I click 'Save' button
And I click 'ORDER HISTORY AND DETAILS' link
Then my Personal Information has been successfully updated