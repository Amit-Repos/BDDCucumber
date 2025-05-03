#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Search in Google Home Page

Background: 
  Given Google Page open 
  And Search Text box is present and enabled in Google Home Page
 
  Scenario: Search Cucumber Tutorial
  
    
    When User enters Cucumber Tutorial keyword in Search box
    And hit enter Button
    Then All relevant details related to cucumber should be displayed
  
  Scenario: Search Selenium Tutorial
  

    When User enters Selenium Tutorial keyword in Search box
    And hit enter Button
    Then All relevant details related to Selenium should be displayed
  



 # @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

  #  Examples: 
   #   | name  | value | status  |
    #  | name1 |     5 | success |
     # | name2 |     7 | Fail    |
