Feature: Contacts functionality.

  @CLOUD-583
  Scenario: Display all groups list under Contacts module
    Given user is on the contacts page
    When user clicks on + new group icon
    And user can add a new group
    Then user should see groups list under Contacts module

  @CLOUD-584
  Scenario: User should be able to create a new contact
    Given user is on the contacts page
    When user clicks on new contact button
    And user enter full name
    Then user should see new contacts name in the contacts list

  @CLOUD-585
  Scenario: User should be able to edit any selected contact
    Given user is on the contacts page
    When user selects a contact to edit
    And user edits name by adding test to the end
    Then user should see contacts name has been edited in the contacts list

  @CLOUD-586
  Scenario: User should be able to delete any selected contact
    Given user is on the contacts page
    When user clicks on three lines button to display delete tab
    Then user can delete contact by clicking on Delete tab


