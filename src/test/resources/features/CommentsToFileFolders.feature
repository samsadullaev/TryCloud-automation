@wip
Feature:  user should be able to write comments to files/folders.

  Scenario: Verify users to write comments to files/folder

    Given user on the dashboard page
    When the user clicks the "Files" module
    And the user clicks action-icon  from any file on the page
    And the user choose the "Details" option
    And user write a comment "message" inside the input box
    And user click the submit button to post it
    Then Verify the comment is displayed in the comment section.
