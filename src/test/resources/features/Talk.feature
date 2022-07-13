Feature:Talk Function
  @regression
  Scenario: Talk Functionality Conversation
    Given Navigate to qa.trycloud.net
    When Click on talk module on the middle top navigation menu
    When Click search conversations or user inbox
    And Enter a given full name into box
    And Click the create conversation button
    And Click start call button
    Then User should see the screen
