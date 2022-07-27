
Feature:  As a user, I should be able to move or delete any selected file under the Files module

	#US : As a user, I should be able to move or delete any selected file under the Files module
	#
	#  AC:
	#
	# 1-   User can drag and drop a file into a target folder.
	#
	#  2 - User can delete any selected item.

  @CLOUD-595

  Scenario: User can drag and drop a file into a target folder

    Given User is on the Files page
    When User clicks and hold and carry the file to be moved and drops into target folder
    Then User can see that the moved file is inside the target folder




  @cem
  @CLOUD-600
  Scenario: User can delete any selected item.

    Given User is on the Files page
    When User right clicks the file to be deleted
    And User selects the Delete File option from the dropdown
    Then User can see that the deleted file is not in the page anymore

