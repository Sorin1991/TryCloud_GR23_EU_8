Feature: TryCloud login feature

@smoke
  Scenario: Login as a user with valid credential
    Given user on TryCloud login page
    When user enter valid username
    And user enter valid password
    Then user should see the main page

@Ariane
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
