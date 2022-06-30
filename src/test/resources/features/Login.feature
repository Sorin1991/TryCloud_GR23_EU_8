Feature: TryCloud login feature

  Scenario: Login as a user with valid credential
    Given user on TryCloud login page
    When user enter valid username
    And user enter valid password
    Then user should see the main page
