package rw.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import rw.pages.TourismPage;

public class VerifyTourismPage {

    private WebDriver driver;
    private TourismPage tourismPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        tourismPage = new TourismPage(driver);
    }

    @Test
    public void verifyCountryClick() throws InterruptedException {
        driver.get("http://www.rw.by/tourism_and_recreation/");

        tourismPage.selectCountry();
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
