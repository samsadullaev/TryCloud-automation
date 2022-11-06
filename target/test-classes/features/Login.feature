Feature:  user should de able to log in

@wip
  Scenario Outline: verify user login with valid credentials
    Given  user on the login page
    When user enter valid username "<username>" and password "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page, expected page is "Dashboard - Trycloud QA"

    Examples:
      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |

