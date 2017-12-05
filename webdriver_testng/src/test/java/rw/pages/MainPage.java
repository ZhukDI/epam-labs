package rw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    By trainFrom = By.name("train_from");

    By trainTo = By.name("train_to");

    By trainDate = By.name("train_date");

    By fTickets = By.id("fTickets");

    By searchInp = By.id("searchinp");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeTrainFrom() {
        driver.findElement(trainFrom).sendKeys("Минск");
    }

    public void typeTrainTo() {
        driver.findElement(trainTo).sendKeys("Брест");
    }

    public void typeTrainDate() {
        driver.findElement(trainDate).sendKeys("20.12.2017");
    }

    public void submitFTickets() {
        driver.findElement(fTickets).submit();
    }

    public void typeSearchInp() {
        driver.findElement(searchInp).sendKeys("Минск");
    }

    public void submitSearchInp() {
        driver.findElement(searchInp).submit();
    }

}
