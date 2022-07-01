Feature: Online Status functionality

  User Story: As a user, I should be able to change my online status and set a status message


  Scenario: User should be able to see Online Status pop-up window
    Given User is on the home page
    When User click Avatar at the right top of the field
    And User click Online Status option
    Then User see the Online Status pop-up window

    @wip
    Scenario: User should be able to change Online Status
      Given User is on the home page
      When User click Online Status field at the middle of the page
      When User click Online option
