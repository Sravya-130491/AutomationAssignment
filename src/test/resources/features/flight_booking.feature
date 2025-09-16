Feature: Flight search on MakeMyTrip

  Scenario: Search for round trip flights
    Given I open the MakeMyTrip website
    When I select round trip and enter "HYD" and "MAA"
    And I select departure and return dates
    Then I should see the search results page




  Scenario: Searching for a flight from HYD to MAA
    Given I launch the MakeMyTrip website
    When I select "Flights" option
    And I select "Round Trip"
    And I enter "HYD" as the From location
    And I enter "MAA" as the To location
    And I select a "Departure Date" and "Return Date"
    And I click on "Search" button
    Then I should see the search page displayed with available flights

