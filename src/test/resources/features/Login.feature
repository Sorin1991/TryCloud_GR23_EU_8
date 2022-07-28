Feature: TryCloud login feature


  Scenario: Login as a user with valid credential
    Given user on TryCloud login page
    When user enter valid username
    And user enter valid password
    Then user should see the main page

    Scenario Outline: Login with valid credentials boundary test
      Given user on TryCloud login page
      When user enters a valid "<username>"
      And user enters a correct "<password>"
      Then user should see the main page
      Then user is definitely on the dashboard page

      Examples:
      |username | password|
      |User2    | Userpass123 |
      |User300  | Userpass123 |

 @CLOUD-577
  Scenario Outline: negative scenario - login with invalid password
    Given user on TryCloud login page
    When user enters a valid "<username>"
    And user enters an INCORRECT "<password>"
  And user should see the main page
    Then user should see an error message

  Examples:
    |username | password|
    |User2    | Userpass111 |
    |User300  | Password123 |

@DoNotRunOrItWillBlockYou

  Scenario: negative scenario - MULTIPLE (6) login with invalid password
    Given user on TryCloud login page
    When user enters a valid username
    And user enters an INCORRECT password
    And user should see the main page

    And user enters an INCORRECT password
    And user should see the main page

    And user enters an INCORRECT password
    And user should see the main page

    And user enters an INCORRECT password
    And user should see the main page

    And user enters an INCORRECT password
    And user should see the main page

    And user enters an INCORRECT password
    And user should see the main page
    Then user should see the throttled up warning message

