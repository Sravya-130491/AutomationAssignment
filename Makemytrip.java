import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class MakeMyTripTest {
    public static void main(String[] args) {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/");

        try {
            // Close popup if present
            driver.findElement(By.cssSelector("body")).click();

            // Click on Flights
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

            // Departure Date (pick a date dynamically)
            driver.findElement(By.xpath("//div[@aria-label='Sat Sep 21 2025']")).click();

            // Return Date (pick a date dynamically)
            driver.findElement(By.xpath("//div[@aria-label='Sat Sep 27 2025']")).click();

            // Search Button
            driver.findElement(By.xpath("//a[text()='Search']")).click();

            // Verification
            if (driver.getTitle().contains("Flights")) {
                System.out.println("Search results displayed successfully!");
            } else {
                System.out.println("Search results NOT displayed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}


