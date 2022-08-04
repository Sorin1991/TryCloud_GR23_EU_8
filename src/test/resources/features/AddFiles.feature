Feature: Add files in TryCloud

  Background:
    Given User is on the Files page


  @CLOUD-598
  Scenario: Add files function
    When user click on add button
    And user can see upload files option from dropDown
    And user upload files
    Then user can see uploaded file on the list



