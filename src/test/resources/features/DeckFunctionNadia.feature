Feature: A user should be able to create/edit and delete a note under the Deck module

  @Nadia
  Scenario: Display all boards under the Deck module
    Given user is on the Deck module
    When user clicks on the three bars button
    Then user clicks on all boards to view all boards

  @Nadia
  Scenario Outline: User should be able to create a new board
    Given user is on the Deck module
    Then user clicks on the three bars button
    Then user click on the Add board button
    And user can create a new board name "<name>"
    Examples:
      | name  |
      | James |
      | John  |
      | Jack  |
      | Steve |
      | Joe   |

  @Nadia
  Scenario: User should be able to edit board
    Given user is on the Deck module
    Then user clicks on all boards to view all boards
    Then user is able to edit an existing board

  @Nadia
  Scenario: User should be able to delete an existing board
    Given user is on the Deck module
    Then user clicks on all boards to view all boards
    And the user is able to delete an existing board


