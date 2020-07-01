Feature: User Login

Scenario: Valid user Login
Given User is on the Landing Page         
When User enters username and password
Then User reaches the Home Page
And User click on logout button