
Feature:  As a user, I should be able to move or delete any selected file under the Files module

	#US : As a user, I should be able to move or delete any selected file under the Files module
	#
	#  AC:
	#
	# 1-   User can drag and drop a file into a target folder.
	#
	#  2 - User can delete any selected item.

  @CLOUD-595
    @cem
  Scenario: User can drag and drop a file into a target folder

    Given User is on the Files page
    When User clicks and hold and carry the file to be moved and drops into target folder
    Then User can see that the moved file is inside the target folder


