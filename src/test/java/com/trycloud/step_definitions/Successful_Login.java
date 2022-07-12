package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Successful_Login {

    LoginBasePage loginBasePage = new LoginBasePage();
    HomePage homePage = new HomePage();

    @Given("user on TryCloud login page")
    public void user_on_try_cloud_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("TryCloud.url"));}


    @When("user enter valid username")
    public void user_enter_valid_username() {
        loginBasePage.usernameBox.sendKeys(ConfigurationReader.getProperty("TryCloud.username"));

//TryCloud.username
    }
    @When("user enter valid password")
    public void user_enter_valid_password() {
        loginBasePage.passwordBox.sendKeys(ConfigurationReader.getProperty("TryCloud.password"));

    }
    @Then("user should see the main page")
    public void user_should_see_the_main_page() {
loginBasePage.loginButton.click();
    }


    //boundary test - positive


    @When("user enters a valid {string}")
    public void userEntersAValid(String arg0) {loginBasePage.usernameBox.sendKeys(arg0);
    }

    @And("user enters a correct {string}")
    public void userEntersACorrect(String arg0) {loginBasePage.passwordBox.sendKeys(arg0);
    }


    @Then("user is definitely on the dashboard page")
    public void userIsDefinitelyOnTheDashboardPage() {
        BUtility.waitForPageToLoad(10);
       //id="appmenu"
// text elements , including title, could not be used for verification as dashboard
// appears sometimes in Turkish sometimes in English, so title would say 'dashboard'
// for User 2 but 'pano' for User300.
        BUtility.verifyElementDisplayed(homePage.topLeftIconMenu);
    }
}
