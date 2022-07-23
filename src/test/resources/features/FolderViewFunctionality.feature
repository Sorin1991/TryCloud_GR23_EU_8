
Feature: User can change the folder view
  1- According to "Names" with alphabetical order and reverse_alphabetical order,
  2- According to "Size" from smaller to larger and from larger to smaller,
  3- According tp date of last modification, from earlier to later and from later to earlier.


  Background:
    When User is on the Files page

  Scenario: User can change the folder view according to the ""Names" in alphabetical order
    And User clicks the Size sort icon
    And User clicks the Names sort icon
    Then User can see that the files are arranged according to the alphabetical order

    Scenario: User can change the folder view according to the ""Names" in reverse alphabetical order
    And User clicks the Size sort icon
    And User clicks the Names sort icon
    And User clicks the Names sort icon
    Then User can see that the files are arranged according to the reverse alphabetical order

  Scenario: User can change the folder view according to the "Size" from larger to smaller
    And User clicks the Names sort icon
    And User clicks the Size sort icon
    Then User can see that the files are arranged according to the size from from larger to smaller

  Scenario: User can change the folder view according to the "Size" from smaller to larger
    And User clicks the Names sort icon
    And User clicks the Size sort icon
    And User clicks the Size sort icon
    Then User can see that the files are arranged according to the size from smaller to larger

  Scenario: User can change the folder view according to the "Date of Modification" from earlier to later
    And User clicks the Size sort icon
    And User clicks the Modified sort icon
    Then User can see that the files are arranged according to the Date of Modification from earlier to later

  Scenario: User can change the folder view according to the "Date of Modification" from later to earlier
    And User clicks the Size sort icon
    And User clicks the Modified sort icon
    And User clicks the Modified sort icon
    Then User can see that the files are arranged according to the Date of Modification from later to earlier

