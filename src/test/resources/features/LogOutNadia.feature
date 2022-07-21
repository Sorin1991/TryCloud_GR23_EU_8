Feature: User access


  @CLOUD-570
  Scenario: When the user logs out they are shown a login prompt
    Given user is on the dashboard page
    When user logs out
    Then user is on the login profile page

