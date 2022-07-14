Feature: TryCloud logout feature

  @nadia
  @CLOUD-513
  Scenario: As a user, I should be able to log out
    Given user is  on the dashboard page
    Then user is able to logout successfully
    And user is on the login profile page

