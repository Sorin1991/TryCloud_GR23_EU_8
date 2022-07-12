Feature: Contacts Functionality - add contact to a group

	#US:
	#As a user, I should be able to add any current contact into a group under Contacts module so that I can communicate with.
	#
	#AC:
	#User should be able to click any groups options button
	#User should be able to click on "Add contacts to group.
	#User should be able to Search for contact in the search bar under "add contacts
	#User should be able to Choose any contact
	#User should not be able to click add contact until a contact is selected
	#User should be able to click "add to group" once a contact is selected
	#User should be able to successfully add a contact to a group
	@CLOUD-538
		Scenario: Verify user can add any contact into a group
		
		 Given user is on contacts page 
		 When user clicks on group options button 
		 And user clicks add contacts button 
		 And user can search for a contact 
		 And user can select a contact 
		 Then user can add the contact to the group