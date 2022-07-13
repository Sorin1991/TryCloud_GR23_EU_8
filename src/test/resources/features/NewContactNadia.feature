Feature: TryCloud contacts module.

   @CLOUD-525
  Scenario: User should be able to create a new contact
    Given user is on contacts page
    Then user clicks on new contact button
    And user enter full name
    And user enters telephone number
    And user enters email address
    Then user should see new contacts name

