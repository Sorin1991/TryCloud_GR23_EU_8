package com.trycloud.step_definitions;

import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddContactToGroup_StepDefs {

    ContactsPage contactsPage = new ContactsPage();



    @When("user clicks on group options button")
    public void user_clicks_on_group_options_button() {
        contactsPage.groupOptionsButton.click();
        BUtility.sleep(2);
    }

    @When("user clicks add contacts button")
    public void user_clicks_add_contacts_button() {
        contactsPage.addContactsBtn.click();
    }

    @When("user can search for a contact")
    public void user_can_search_for_a_contact() {
        contactsPage.searchBarToAddContactInGroup.sendKeys("Cydeo Student");
        BUtility.sleep(2);
        contactsPage.searchBarToAddContactInGroup.clear();
        BUtility.sleep(2);
    }

    @When("user can select a contact")
    public void user_can_select_a_contact() {
        contactsPage.selectedContact.click();
    }

    @Then("user can add the contact to the group")
    public void user_can_add_the_contact_to_the_group() {
        contactsPage.addToGroupButton.click();
        BUtility.sleep(3);

        contactsPage.verifyContactInList.isDisplayed();

    }






}
