package rw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TourismPage {

    WebDriver driver;

    By country = By.xpath("/html/body/div/div/div/div/div/div/div/div/ul/li/a");

    public TourismPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCountry() {
        driver.findElement(country).click();
    }

}
