package rw.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import rw.pages.SchedulePage;

public class VerifySchedulePage {

    private WebDriver driver;
    private SchedulePage schedulePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        schedulePage = new SchedulePage(driver);
    }

    @Test
    public void verifyPopularRouteClick() {
        driver.get("http://rasp.rw.by/ru/");

        schedulePage.clickOnPopularRoute();
    }

    @Test
    public void verifyStationSearch() {
        driver.get("http://rasp.rw.by/ru/");

        schedulePage.typeStation();
        schedulePage.submitStation();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
