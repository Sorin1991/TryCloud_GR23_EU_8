package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.OnlineStatusFieldPage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class OnlineStatus_Step_Defs {

    LoginBasePage loginBasePage = new LoginBasePage();
    OnlineStatusFieldPage onlineStatusFieldPage = new OnlineStatusFieldPage();

    HomePage homePage = new HomePage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        loginBasePage.loginToDashboardPage();

    }


    @When("User click Avatar at the right top of the field")
    public void user_click_avatar_at_the_right_top_of_the_field() {
        homePage.avatar.click();


    }


    @When("User click Online Status option")
    public void user_click_online_status_option() {
        homePage.avatarDropdownStatusOption.click();

    }

    @Then("User see the Online Status pop-up window")
    public void user_see_the_online_status_pop_up_window() {
        Assert.assertTrue( homePage.onlineStatusPopUpWindow.isDisplayed());


    }

    @When("User click Online Status field at the middle of the page")
    public void userClickOnlineStatusFieldAtTheMiddleOfThePage() {
        homePage.onlineStatusField.click();




    }

    @When("User click Online option")
    public void userClickOnlineOption() {

        onlineStatusFieldPage.online.click();

    }


    @And("User click close sign")
    public void userClickCloseSign() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.setStatusMessageButton).click().perform();

    }

    @Then("User should see Online text in the Online Status field")
    public void userShouldSeeOnlineTextInTheOnlineStatusField() {
        String expectedText = "Online";
        Assert.assertEquals(expectedText,homePage.onlineOptionTextInTheStatusField.getText());

    }
}
