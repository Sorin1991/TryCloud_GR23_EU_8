Feature:Talk Function

  @wip
  Scenario: Talk Functionality Conversation
    Given Navigate to qa.trycloud.net
    When Verify the module is highlighted when hover over
    When users should see the talk option
    And Click on talk module on the middle top navigation menu
    And Click search conversations or user inbox
    Then Enter a given full name into box which is not more than 10 characters
    Then  Click start call button