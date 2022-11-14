
Feature: As a user, I should be able to update settings

  @us10
  Scenario Outline: User should able to click any checkboxes
    Given  user on the login page
    When user enter valid username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any buttons

    Examples:
      | username  | password    |
      | user18    | Userpass123 |
      | user48    | Userpass123 |
      | user78    | Userpass123 |
      | user108   | Userpass123 |





  Scenario Outline: Verify users to see the app storage usage
    Given  user on the login page
    When user enter valid username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    And user checks the current storage usage
    And user uploads file with the upload file option
    And user refresh the page
    Then the user should be able to see storage usage is increased

    Examples:
      | username  | password    |
      | user18    | Userpass123 |
      | user48    | Userpass123 |
      | user78    | Userpass123 |
      | user108   | Userpass123 |