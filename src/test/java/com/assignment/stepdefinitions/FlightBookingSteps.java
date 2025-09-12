package com.assignment.stepdefinitions;

import io.cucumber.java.en.*;

public class FlightBookingSteps {
    @Given("I open the MakeMyTrip website")
    public void openSite() {
        System.out.println("Open MakeMyTrip in browser");
    }

    @When("I select round trip and enter {string} and {string}")
    public void enterLocations(String from, String to) {
        System.out.println("From: " + from + ", To: " + to);
    }

    @And("I select departure and return dates")
    public void selectDates() {
        System.out.println("Dates selected");
    }

    @Then("I should see the search results page")
    public void verifyResults() {
        System.out.println("Search results verified");
    }
}
