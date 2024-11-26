package pages;

import base.BaseTest;
import org.openqa.selenium.By;

public class HomePage {

    By startHere = By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']");
    By startHereText = By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']");

    public void clickStartHere() {
        BaseTest.driver.findElement(startHere).click();
    }

    public void verifyStartHereText() {
        String text = BaseTest.driver.findElement(startHereText).getText();
    }
}
