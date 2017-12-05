package rw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SchedulePage {

    WebDriver driver;

    By popularRoute = By.linkText("Минск — Гомель");

    By station = By.name("station");

    public SchedulePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnPopularRoute() {
        driver.findElement(popularRoute).click();
    }

    public void typeStation() {
        driver.findElement(station).sendKeys("Молодечно");
    }

    public void submitStation() {
        driver.findElement(station).submit();
    }

}
