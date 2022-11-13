@wip
Feature: As a user, I should be able to remove files from the favorites and upload a file directly
  Story: As a user, I should be able to manage folders.

  @scenario1
    Scenario: Verify users can add the folder
     Given user on the dashboard page
     When the user clicks the "Files" module
     And user clicks the add icon on the top
     And user click 'new folder'
     And user write a folder name
     When the user click submit icon

  @scenario2

    Scenario:  Verify users can upload a file inside a folder
      Given user on the dashboard page
      When the user clicks the "Files" module
      And user choose a folder from the page
      And user clicks the add icon on the top
      When the user uploads a file with the upload file option
      And Verify the file is displayed on the page
      Then delete uploaded file


