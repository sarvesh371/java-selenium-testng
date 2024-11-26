package tests;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupPage;

public class SampleTest extends BaseTest {

    HomePage homePage = new HomePage();
    SignupPage signupPage = new SignupPage();

    @Test
    public void clickStartHereButton() {
        logger.info("Verifying button click");
        homePage.clickStartHere();

    }

    @Test
    public void verifyStartHereButtonText() {
        logger.info("Verifying button text");
        homePage.verifyStartHereText();

    }

    @Test(dataProvider = "testData")
    public void verifySignup(String email, String password) {
        logger.info("Verifying button click");
        homePage.clickStartHere();
        signupPage.enterEmail(email);
        signupPage.enterPassword(password);
        signupPage.clickLoginButton();
    }

    @DataProvider(name = "testData")
    public Object[][] data() {
        return new Object[][] {
                { "user1", "password1" },
                { "user2", "password2" },
                { "user3", "password3" }
        };
    }


}
