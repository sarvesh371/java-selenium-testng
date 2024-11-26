package pages;

import base.BaseTest;
import org.openqa.selenium.By;

public class SignupPage {
    By email = By.xpath("//input[@placeholder='Email']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//div[@class='ui fluid large blue submit button']");

    public void enterEmail(String emailText) {
        BaseTest.driver.findElement(email).sendKeys(emailText);
    }

    public void enterPassword(String passwordText) {
        BaseTest.driver.findElement(password).sendKeys(passwordText);
    }

    public void clickLoginButton() {
        BaseTest.driver.findElement(loginButton).click();
    }


}
