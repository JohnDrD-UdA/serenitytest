Feature: Search by keyword
  Scenario: Searching for 'lg tv'
    Given user is researching things on the internet
    When user looks up "lg tv"
    Then user should see information about "lg tv"
