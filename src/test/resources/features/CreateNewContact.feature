Feature: Contacts Functionality - create new contact

  @
  Scenario: Verify user can be able to create a new contact

    Given user is on contacts page
    When user clicks + new contact button
    And user adds name to contact
    And user adds email address
    And user adds phone number
    Then user should see new contacts name
