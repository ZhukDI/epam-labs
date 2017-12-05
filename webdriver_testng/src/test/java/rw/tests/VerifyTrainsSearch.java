package rw.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import rw.pages.MainPage;

public class VerifyTrainsSearch {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Test
    public void verifyTrainsSearch() throws InterruptedException {
        driver.get("http://www.rw.by/");

        mainPage.typeTrainFrom();
        Thread.sleep(1000);
        mainPage.typeTrainTo();
        Thread.sleep(1000);
        mainPage.typeTrainDate();
        Thread.sleep(1000);
        mainPage.submitFTickets();
    }

    @Test
    public void verifySearch() {
        driver.get("http://www.rw.by/");

        mainPage.typeSearchInp();
        mainPage.submitSearchInp();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
