Feature: Login feature for table testing

Scenario: Login page from table

Given User navigate to orange login page
When User enter the Valid Username and Password
|Admin|admin546|
|admin|admin123|
 
And User Click the Login button
Then User should be navigate to Home page
