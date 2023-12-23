Feature: OrangeHRM Login

Scenario Outline: OrangeHRM Login Scenario outline

Given User navigate to OrangeHRM login page
When User enter the valid   "<Username>" and "<Password>"
Then User click the login button
And User should be navigate Home page

Examples:
|Username|Password|
|Admin   |admin123|


