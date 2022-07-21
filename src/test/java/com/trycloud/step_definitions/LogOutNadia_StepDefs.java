package com.trycloud.step_definitions;

import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.LogOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutNadia_StepDefs {

    LoginBasePage loginBasePage = new LoginBasePage();
    LogOutPage logoutPage = new LogOutPage();


    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {
        loginBasePage.loginToDashboardPage();
    }
    @When("user logs out")
    public void userLogsOut() {
        logoutPage.userImageIcon.click();
        logoutPage.logOutButton.click();
    }

    @Then("user is on the login profile page")
    public void userIsOnTheLoginProfilePage() {
        Assert.assertTrue(logoutPage.homePage.isDisplayed());
    }


}
