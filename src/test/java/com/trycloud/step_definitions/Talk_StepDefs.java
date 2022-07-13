package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Talk_StepDefs {
    TalkPage talkPage=new TalkPage();
    LoginBasePage loginBasePage = new LoginBasePage();
    Faker faker=new Faker();
    @Given("Navigate to qa.trycloud.net")
    public void navigate_to_qa_trycloud_net() {
        loginBasePage.loginToDashboardPage();
    }

    @When("Click on talk module on the middle top navigation menu")
    public void click_on_talk_module_on_the_middle_top_navigation_menu() {
        talkPage.talkButton.click();
    }
    @And("Click search conversations or user inbox")
    public void click_search_conversations_or_user_inbox() {
        talkPage.plusButton.click();

    }
    @When("Enter a given full name into box")
    public void enter_a_given_full_name_into_box() throws InterruptedException {
        Thread.sleep(3000);
        talkPage.talkMentions.sendKeys("meeting"+Keys.ENTER);
        Thread.sleep(3000);
        talkPage.searchParticipant.sendKeys(faker.name().fullName());
        Thread.sleep(3000);


    }
    @Then("Click start call button")
    public void click_start_call_button() throws InterruptedException {
        talkPage.createConversation.click();
        Thread.sleep(3000);

        talkPage.startcall.click();
        Thread.sleep(3000);


    }

}
