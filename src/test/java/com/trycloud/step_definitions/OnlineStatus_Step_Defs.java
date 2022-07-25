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
import org.openqa.selenium.JavascriptExecutor;
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

    @When("User click on Status message input box")
    public void user_click_on_status_message_input_box() {
        onlineStatusFieldPage.statusMessageInputBox.click();
        BUtility.waitFor(1);
    }
    @Then("User should see the placeholder message is displayed in the Status message box")
    public void user_should_see_the_placeholder_message_is_displayed_in_the_status_message_box() {
        Assert.assertTrue(onlineStatusFieldPage.placeHolderMessage.isDisplayed());
    }
    @When("User enters a status message that  has max thirty character")
    public void user_enters_a_status_message_that_has_max_character() {

        onlineStatusFieldPage.statusMessageInputBox.clear();
        onlineStatusFieldPage.statusMessageInputBox.sendKeys("I am working on my user story!");
        BUtility.waitFor(1);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.setStatusMessageButton).click().perform();


    }

    @Then("User should see the message is displayed on the Online Status field.")
    public void user_should_see_the_message_is_displayed_on_the_online_status_field() {
        String expectedMessage = "I am working on my user story!";

        Assert.assertEquals(expectedMessage,homePage.onlineStatusField.getText().trim());
    }


    @When("User enters a status message that  has  thirty one character")
    public void userEntersAStatusMessageThatHasThirtyOneCharacter() {
        onlineStatusFieldPage.statusMessageInputBox.clear();
        onlineStatusFieldPage.statusMessageInputBox.sendKeys("I am working on my user story!!");
        BUtility.waitFor(1);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.setStatusMessageButton).click().perform();
    }

    @Then("User should see the error message under the status message box")
    public void userShouldSeeTheErrorMessageUnderTheStatusMessageBox() {

    }


    @Then("User click Clear status message button and the message should be disappeared at the Online status field")
    public void userClickClearStatusMessageButtonAndTheMessageShouldBeDisappearedAtTheOnlineStatusField() {

        String resentMessage = homePage.onlineStatusField.getText().trim();

        BUtility.waitFor(1);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.clearStatusButton).click().perform();
        BUtility.waitFor(1);
        Assert.assertNotEquals(resentMessage,homePage.onlineStatusField.getText().trim());

    }


    @When("User click Clear status after input box")
    public void user_click_clear_status_after_input_box() {
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)");
        BUtility.waitFor(1);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.clearStatusAfterBox).click().perform();
        BUtility.waitFor(1);


    }
    @Then("User should see time slots dropdown")
    public void user_should_see_time_slots_dropdown() {
        Assert.assertTrue(onlineStatusFieldPage.timeSlotsDropdown.isDisplayed());

    }
    @When("User select an {string} from the dropdown")
    public void user_select_an_from_the_dropdown(String string) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(onlineStatusFieldPage.selectATimeSlot(string)).click().perform();
        BUtility.waitFor(1);


    }
    @Then("User should see {string} message in the clear status after box")
    public void user_should_see_message_in_the_clear_status_after_box(String string) {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@class='multiselect__single']")).isDisplayed());

        Assert.assertEquals(string,Driver.getDriver().findElement(By.xpath("//span[@class='multiselect__single']")).getText());


    }


}
