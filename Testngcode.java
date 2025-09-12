import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class MakeMyTripTestNG {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void testFlightSearch() throws InterruptedException {
        // Click on Flights tab
        WebElement flightsTab = driver.findElement(By.xpath("//span[text()='Flights']"));
        flightsTab.click();

        // Select Round Trip
        WebElement roundTrip = driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
        roundTrip.click();

        // From Location
        WebElement fromInput = driver.findElement(By.id("fromCity"));
        fromInput.click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
        driver.findElement(By.xpath("//p[contains(text(),'Hyderabad')]")).click();

        // To Location
        WebElement toInput = driver.findElement(By.id("toCity"));
        toInput.click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("MAA");
        driver.findElement(By.xpath("//p[contains(text(),'Chennai')]")).click();

        // Departure and Return Date 
        driver.findElement(By.xpath("//div[@aria-label='Sat Sep 21 2025']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Sat Sep 27 2025']")).click();

        // Search
        driver.findElement(By.xpath("//a[text()='Search']")).click();

        // Validate
        assert driver.getTitle().contains("Flights") : "Search results NOT displayed!";
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


