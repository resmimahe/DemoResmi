Feature: Amazone Login

Scenario Outline: Valid user Login- Positive Scenario
Given User Launches the Amazone Application         
Then User clicks on the login button
When User enter <UserName> and <Password>
And User reaches the Amazone Home Page

Examples:
|UserName   |Password |
|username   |pwd      |
|username   |pwd1     |