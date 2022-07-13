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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        BUtility.waitFor(1);

    }

   /* @Then("User should see Online text in the Online Status field")
    public void userShouldSeeOnlineTextInTheOnlineStatusField() {
        String expectedText = "Online";
        Assert.assertEquals(expectedText,onlineStatusFieldPage.onlineOptionTextInTheStatusField.getText());

    }*/



    @And("User click {string} option")
    public void userClickOption(String option) {
        onlineStatusFieldPage.getStatusOption(option).click();
    }

    @Then("User should see {string} text in the Online Status field")
    public void userShouldSeeTextInTheOnlineStatusField(String expectedText) {
       //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
      //wait.until(ExpectedConditions.visibilityOf(onlineStatusFieldPage.getDisplayedStatus(expectedText)));
        Assert.assertEquals(expectedText,homePage.onlineStatusField.getText().trim());
    }

    @And("User click on {string} status message option")
    public void userClickOnStatusMessageOption(String option) {
        onlineStatusFieldPage.getReadyStatusMessageOption(option).click();

    }


    @And("User click on Set status message button")
    public void userClickOnSetStatusMessageButton() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.setStatusMessageButton).click().perform();
        BUtility.waitFor(1);


    }


    @Then("User should see that {string} message is  displayed at the Online Status field")
    public void userShouldSeeThatMessageIsDisplayedAtTheOnlineStatusField(String message) {

        String displayedMessage = Driver.getDriver().findElement(By.xpath("//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")).getText();

        Assert.assertEquals(message,displayedMessage.substring(2).trim());


    }


}
