Feature: A user should be able to create/edit and delete a note under the Deck module

  @CLOUD-573
  Scenario: Display all boards under the Deck module
    Given user is on the Deck module
    When user clicks on the three bars button
    Then user clicks on all boards to view all boards

   @CLOUD-574
  Scenario Outline: User should be able to create a new board
    Given user is on the Deck module
    When user clicks on the plus button
    Then user can create a new board name "<name>"
    Examples:
      | name  |
      | Sarah |
      | Zara  |
      | Maryam  |
      | Imaan |
      | Annie   |

  @CLOUD-575
  Scenario: User should be able to edit board
    Given user is on the Deck module
    When user clicks on all boards to view all boards
    Then user is able to edit an existing board

    @CLOUD-576
  Scenario: User should be able to delete an existing board
    Given user is on the Deck module
    And user clicks on all boards to view all boards
    Then the user is able to delete an existing board


