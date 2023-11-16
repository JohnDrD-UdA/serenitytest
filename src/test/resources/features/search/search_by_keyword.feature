Feature: Search by keyword
  Scenario: Searching for 'VIZIO TV'
    Given user is researching things on amazon
    When user looks up 'VIZIO TV'
    And user clicks first item
    And user clicks add cart btn
    Then user should cart count go to 1

