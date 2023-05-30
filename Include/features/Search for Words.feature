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
@tag
Feature: Search for Words
 
 
  @valid
  Scenario Outline: User found the words they were search for
    Given I open ColorNoteApp
    When I tap Search button
    And I type wordOne <wordOne>
    Then I am able to view the <wordOne> result

    Examples: 
      |	wordOne			| 
      | Test Title  |
      
      
   @valid
   Scenario Outline: User searches for more than one word
    Given I open ColorNoteApp
    When I tap Search button
    And I type wordOne <wordOne>
    And I view the first <wordOne> result
    And I clear text
    And I type wordTwo <wordTwo>
    Then I am able to view second <wordTwo> result

    Examples: 
      | wordOne			| wordTwo					|
      |Set reminder |Archive reminder|
    