Feature: Flight search on MakeMyTrip

  Scenario: Search for round trip flights
    Given I open the MakeMyTrip website
    When I select round trip and enter "HYD" and "MAA"
    And I select departure and return dates
    Then I should see the search results page
