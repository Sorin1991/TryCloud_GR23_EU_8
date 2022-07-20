package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Unsuccessful_login {
    LoginBasePage loginBasePage = new LoginBasePage();
    HomePage homePage = new HomePage();


    @And("user enters an INCORRECT {string}")
    public void userEntersAnINCORRECT(String arg0) {
        loginBasePage.passwordBox.sendKeys(arg0);

    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        BUtility.verifyElementDisplayed(loginBasePage.wrongUsernamePasswordMsg);
    }

    @When("user enters a valid username")
    public void userEntersAValidUsername()
    { loginBasePage.usernameBox.sendKeys("User200");
    }

    @And("user enters an INCORRECT password")
    public void userEntersAnINCORRECTPassword() {

        loginBasePage.passwordBox.sendKeys("Wrongpassword123");
    }

    @Then("user should see the throttled up warning message")
    public void userShouldSeeTheThrottledUpWarningMessage() {
        BUtility.verifyElementDisplayed(loginBasePage.throttledWarningMsg);

    }


}
