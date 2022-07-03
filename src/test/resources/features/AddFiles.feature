Feature: Add files in TryCloud

  @wip
  Scenario: Add files function
    Given user on TryCloud login page
    When user enter valid username
    And user enter valid password
    And user should see the main page
    And user click on files tab
    Then user can see files page



