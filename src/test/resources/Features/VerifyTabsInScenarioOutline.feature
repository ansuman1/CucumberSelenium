@Regression
Feature: Test Scenario_Outline with examples
Scenario Outline: 
Given I am in weather application
When I am on Home page
Then I can search <multiple cities>

Examples:
|multiple cities|
|Milwaukee, USA|
|New York, USA|
|Bhubaneswar, India|

