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

    @Given("I launch the MakeMyTrip website")
     public void iLaunchTheWebsite() {
       driver.get("https://www.makemytrip.com/");
       }
    
    @When("I select {string} option")
    public void iSelectOption(String option) {
    if(option.equals("Flights")) {
        driver.findElement(By.linkText("Flights")).click();
    }

     @And("I select {string}")
    public void iSelectRoundTrip(String tripType) {
    if(tripType.equals("Round Trip")) {
        driver.findElement(By.id("roundTripOption")).click();
    }

    @And("I enter {string} as the From location")
    public void iEnterFromLocation(String fromLocation) {
    driver.findElement(By.id("fromLocation")).sendKeys(fromLocation);
      }

   @And("I enter {string} as the To location")
    public void iEnterToLocation(String toLocation) {
    driver.findElement(By.id("toLocation")).sendKeys(toLocation);
  }

    @And("I select a {string} and {string}")
    public void iSelectDates(String departureDate, String returnDate) {
    driver.findElement(By.id("departureDate")).sendKeys(departureDate);
    driver.findElement(By.id("returnDate")).sendKeys(returnDate);
    }

    @And("I click on {string} button")
    public void iClickOnSearchButton(String button) {
        driver.findElement(By.id("searchButton")).click();
    }
    @Then("I should see the search page displayed with available flights")
    public void iVerifySearchPage() {
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("Search Results"));
    }


}
