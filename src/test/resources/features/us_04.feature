@us_04
Feature: As a user, I should be able to access to Files module.

  Background:
    Given user on the dashboard page
    When the user clicks the "Files" module

  Scenario: verify users can access to Files module
    Then verify the user should be at the dashboard page, expected page is "Dashboard - Trycloud QA"
  @us_04
  Scenario: verify users can select all the uploaded files from the page
    And user clicks the top-left checkbox of the table
    Then verify all the files are selected