package com.assignment.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void openMakeMyTrip() {
        driver.get("https://www.makemytrip.com");
        assert driver.getTitle().contains("MakeMyTrip");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
