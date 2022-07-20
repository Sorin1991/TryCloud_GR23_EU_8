Feature: Online Status functionality
	Background:
		Given User is on the home page

 	#*User Story:* As a user, I should be able to change my online status and set a status message
	#
	#*A.C:* User should be able to see Online Status pop-up window



	@CLOUD-528
	Scenario: Verify that should see Online Status pop-up window

		    When User click Avatar at the right top of the field
		    And User click Online Status option
		    Then User see the Online Status pop-up window


	#*User Story:* As a user, I should be able to change my online status and set a status message
	#
	#*A.C:* User should be able to change Online Status

	@CLOUD-530
	Scenario Outline: Verify that user should be able to change Online Status

		When User click Online Status field at the middle of the page
		And User click "<Options>" option
		And User click close sign
		Then User should see "<Options>" text in the Online Status field
		Examples:
			|Options|
			|Online|
			|Away  |
			|Invisible|
			|Do not disturb|

	@CLOUD-541
	Scenario Outline: Verify that user should be able to set a status message  by selecting ready messages

		When User click Online Status field at the middle of the page
		And User click on "<Options>" status message option
		And User click on Set status message button
		Then User should see that "<Options>" message is  displayed at the Online Status field

		Examples:
		|Options|
		|In a meeting|
		|Commuting   |
		|Working remotely|
		|Out sick        |
		|Vacationing     |


	@CLOUD-591
	Scenario: Verify that user should be able to set a status message by creating their own messages (with max 30 character)
	(positive scenario with 30 character)
		When User click Online Status field at the middle of the page
		And User click on Status message input box
		Then User should see the placeholder message is displayed in the Status message box
		When User enters a status message that  has max thirty character
		And  User click on Set status message button
		Then User should see the message is displayed on the Online Status field.


	Scenario: Verify that user should be able to set a status message by creating their own messages (with max 30 character)
	(negative scenario with 31 character)
		When User click Online Status field at the middle of the page
		And User click on Status message input box
		Then User should see the placeholder message is displayed in the Status message box
		When User enters a status message that  has  thirty one character
		And  User click on Set status message button
		Then User should see the error message under the status message box

	@CLOUD-593
	Scenario: Verify that users should be able to clear status messages
		When User click Online Status field at the middle of the page
		When User enters a status message that  has max thirty character
		And  User click on Set status message button
		And User click Online Status field at the middle of the page
		Then User click Clear status message button and the message should be disappeared at the Online status field


	@CLOUD-594
	Scenario Outline:Verify that users should arrange a time slot to clear status message
		When User click Online Status field at the middle of the page
		And User click Clear status after input box
		Then User should see time slots dropdown
		When User select an "<option>" from the dropdown
		Then User should see "<option>" message in the clear status after box

		Examples:
		|option|
		|Don't clear|
		|30 minutes |
		|an hour    |
		|4 hours    |
		|Today      |
		|This week  |







