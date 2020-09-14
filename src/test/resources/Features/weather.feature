@Smoke
Feature: Weather check

Scenario: verify milwaukee temerature
 
Given I am in weather site
When I search for a City
Then I get the temperature of the city

