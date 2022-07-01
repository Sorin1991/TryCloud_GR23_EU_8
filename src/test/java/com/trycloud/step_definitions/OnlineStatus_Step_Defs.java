package com.trycloud.step_definitions;

import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.OnlineStatusFieldPage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;

public class OnlineStatus_Step_Defs {

    LoginBasePage loginBasePage = new LoginBasePage();
    OnlineStatusFieldPage onlineStatusFieldPage = new OnlineStatusFieldPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("TryCloud.url"));
        loginBasePage.usernameBox.sendKeys("User1");
        loginBasePage.passwordBox.sendKeys("Userpass123");
        loginBasePage.loginButton.click();


    }


    @When("User click Avatar at the right top of the field")
    public void user_click_avatar_at_the_right_top_of_the_field() {
        onlineStatusFieldPage.avatar.click();


    }


    @When("User click Online Status option")
    public void user_click_online_status_option() {
        onlineStatusFieldPage.avatarDropdownStatusOption.click();

    }

    @Then("User see the Online Status pop-up window")
    public void user_see_the_online_status_pop_up_window() {
        Assert.assertTrue( onlineStatusFieldPage.onlineStatusPopUpWindow.isDisplayed());


    }

    @When("User click Online Status field at the middle of the page")
    public void userClickOnlineStatusFieldAtTheMiddleOfThePage() {
        onlineStatusFieldPage.onlineStatusField.click();




    }

    @When("User click Online option")
    public void userClickOnlineOption() {

        onlineStatusFieldPage.online.click();
    }


}
