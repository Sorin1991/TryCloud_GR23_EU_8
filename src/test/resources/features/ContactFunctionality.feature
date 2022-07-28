Feature: Contacts Functionality

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


	@
	Scenario: Verify user can be able to create a new contact

		Given user is on contacts page
		When user clicks + new contact button
		And user adds "{string}" to contact
		And user adds "{string}" address
		And user adds "{string}"
		Then user should see new contacts name


	@CLOUD-588
	Scenario: User can edit any selected contact
		Given user is on contacts page
		When user clicks specific contact
		And user changes the contacts "{string}"
		Then user can verify if the contact is edited successfully


	@CLOUD-589
	Scenario: User can edit any selected contact
		Given user is on contacts page
		When user clicks specific contact
		And user changes the contacts "{string}"
		Then user can verify if the contact is edited successfully


	@CLOUD-590
	Scenario: User can edit any selected contact
		Given user is on contacts page
		When user clicks specific contact
		And user changes the contacts phone "{string}"
		Then user can verify if the contact is edited successfully














