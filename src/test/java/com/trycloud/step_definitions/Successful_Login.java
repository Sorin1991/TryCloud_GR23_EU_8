package com.trycloud.step_definitions;

import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Successful_Login {

    LoginBasePage loginBasePage = new LoginBasePage();

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

}
