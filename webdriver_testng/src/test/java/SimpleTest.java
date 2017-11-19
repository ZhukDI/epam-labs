import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void navigateToRwWebSiteAndSearchMinsk() throws InterruptedException {
        driver.get("http://www.rw.by/");

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Минск");
        searchInput.submit();
        WebElement header = driver.findElement(By.className("name"));
        Thread.sleep(2000);  // Let the user actually see something!
        System.out.println(header.getText());
        Assert.assertEquals(header.getText(), "Отдел материально-технического снабжения");
    }

    @Test
    public void checkTimetableOfTrains() throws InterruptedException {
        driver.get("http://www.rw.by/");

        WebElement fromInput = driver.findElement(By.name("train_from"));
        fromInput.sendKeys("Минск");
        Thread.sleep(1000);

        WebElement toInput = driver.findElement(By.name("train_to"));
        toInput.sendKeys("Брест");
        Thread.sleep(1000);

        WebElement dateInput = driver.findElement(By.name("train_date"));
        dateInput.sendKeys("30.11.2017");
        Thread.sleep(1000);

        driver.findElement(By.id("fTickets")).submit();

        List<WebElement> trains = driver.findElements(By.className("train_text"));
        Thread.sleep(1000);
        System.out.println(trains.size());

        Assert.assertNotEquals(trains.size(), 0);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
