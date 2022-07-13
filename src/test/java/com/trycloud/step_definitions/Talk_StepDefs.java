package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Talk_StepDefs {
    TalkPage talkPage = new TalkPage();
    LoginBasePage loginBasePage = new LoginBasePage();


    Faker faker = new Faker();
    BUtility utility = new BUtility();
    @Given("Navigate to qa.trycloud.net")
    public void navigate_to_qa_trycloud_net() {
        loginBasePage.loginToDashboardPage();
    }
    @When("Click on talk module on the middle top navigation menu")
    public void click_on_talk_module_on_the_middle_top_navigation_menu() {
        talkPage.talkButton.click();
    }

    @When("Click search conversations or user inbox")
    public void click_search_conversations_or_user_inbox() {
        talkPage.plusButton.click();

    }

    @And("Enter a given full name into box")
    public void enter_a_given_full_name_into_box() {


        talkPage.talkMentions.sendKeys("meeting" + Keys.ENTER);
        talkPage.searchParticipant.sendKeys(faker.name().fullName());


    }

    @When("Click the create conversation button")
    public void click_the_create_conversation_button() {
        talkPage.createConversation.click();
        BUtility.waitFor(1);
    }

    @And("Click start call button")
    public void click_start_call_button() throws InterruptedException {
        talkPage.startcall.click();
       BUtility.waitFor(1);

    }

    @Then("User should see the screen")
    public void user_should_see_the_screen() {
        Assert.assertTrue(talkPage.seeingScreen.isDisplayed());

    }
}