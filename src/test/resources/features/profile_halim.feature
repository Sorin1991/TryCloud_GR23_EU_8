Feature: Default

	Background:
		#@CLOUD-291
		Scenario: Login with valid credentials
		    Given the user login with valid credentials
		

	#US:
	#AC:
	@CLOUD-531
	Scenario: Online profile Display test
		Given the user click on the profile avatar
		Then the user sees the dropdown items