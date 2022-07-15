Feature: User access


  @CLOUD-570
  Scenario: When the user logs out they are shown a login prompt
    Given user is on the dashboard page
    Then user is able to logout successfully
    And user is on the login profile page

