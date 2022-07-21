package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.ContactFunctionNadiaPage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ContactsFunctionNadia_StepDefs {

    LoginBasePage loginBasePage = new LoginBasePage();
    ContactFunctionNadiaPage contactFunctionNadiaPage = new ContactFunctionNadiaPage();
    Faker faker = new Faker();

    @Given("user is on the contacts page")
    public void user_is_on_the_contacts_page() {
        loginBasePage.loginToDashboardPage();
        contactFunctionNadiaPage.contactsPageIcon.click();
    }

    @Then("user clicks on new contact button")
    public void user_clicks_on_new_contact_button() {
        contactFunctionNadiaPage.newContactsButton.click();

    }


    @Then("user enters telephone number")
    public void user_enters_telephone_number() {
        contactFunctionNadiaPage.contactsTelephone.sendKeys(faker.phoneNumber().cellPhone());
        BUtility.waitFor(5);
        contactFunctionNadiaPage.contactsTelephone.sendKeys(Keys.RETURN);
        BUtility.waitFor(5);
    }

    @Then("user enters email address")
    public void user_enters_email_address() {
        contactFunctionNadiaPage.contactsEmail.sendKeys("email.email.com");
        BUtility.waitFor(5);
        contactFunctionNadiaPage.contactsEmail.sendKeys(Keys.RETURN);

    }

    @Then("user should see new contacts name in the contacts list")
    public void user_should_see_new_contacts_name_in_the_contacts_list() {
        contactFunctionNadiaPage.contactsEmail.sendKeys(Keys.RETURN);
        BUtility.waitFor(5);
        contactFunctionNadiaPage.TitleSaveOption.click();
        Assert.assertTrue(contactFunctionNadiaPage.contactsFullName.isDisplayed());

    }

    @And("user enter full name")
    public void userEnterFullName() {
        BUtility.sleep(1);
        contactFunctionNadiaPage.contactsFullName.clear();
        BUtility.sleep(1);
        contactFunctionNadiaPage.contactsFullName.sendKeys("Test Fullname");
        BUtility.sleep(1);
        contactFunctionNadiaPage.clearSection.click();

    }

    @When("user clicks on + new group icon")
    public void userClicksOnNewGroupIcon() {
        contactFunctionNadiaPage.newGroupIcon.click();
        BUtility.sleep(1);
    }

    @And("user can add a new group")
    public void userCanAddANewGroup() {
        contactFunctionNadiaPage.newGroupName.sendKeys("Group One");
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.RETURN);
        action.perform();
    }

    @Then("user should see groups list under Contacts module")
    public void userShouldSeeGroupsListUnderContactsModule() {
        Assert.assertTrue(contactFunctionNadiaPage.newGroupNameDisplayed.isDisplayed());

    }


    @Then("user should see contacts name has been edited in the contacts list")
    public void userShouldSeeContactsNameHasBeenEditedInTheContactsList() {
    }

    @When("user clicks on three lines button to display delete tab")
    public void userClicksOnThreeLinesButtonToDisplayDeleteTab() {
        contactFunctionNadiaPage.selectThreeLinesIcon.click();
    }


    @When("user selects a contact to edit")
    public void userSelectsAContactToEdit() {
        contactFunctionNadiaPage.selectsFirstContact.click();
    }

    @And("user edits name by adding test to the end")
    public void userEditsNameByAddingTestToTheEnd() {
        contactFunctionNadiaPage.contactsFullName.sendKeys(" test");
        BUtility.sleep(5);
        contactFunctionNadiaPage.newContactsButton.click();
    }

    @Then("user can delete contact by clicking on Delete tab")
    public void userCanDeleteContactByClickingOnDeleteTab() {
        contactFunctionNadiaPage.deleteContact.sendKeys(Keys.ENTER);

    }
}