Feature: Online Status functionality

 	#*User Story:* As a user, I should be able to change my online status and set a status message
	#
	#*A.C:* User should be able to see Online Status pop-up window

	@CLOUD-528
	Scenario: Verify that should see Online Status pop-up window
			Given User is on the home page
		    When User click Avatar at the right top of the field
		    And User click Online Status option
		    Then User see the Online Status pop-up window


	#*User Story:* As a user, I should be able to change my online status and set a status message
	#
	#*A.C:* User should be able to change Online Status

	@CLOUD-530
	Scenario Outline: Verify that user should be able to change Online Status

		Given User is on the home page
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

		Given User is on the home page
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
