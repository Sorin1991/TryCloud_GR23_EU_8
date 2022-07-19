package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.ContactsPage;
import com.trycloud.utilities.BUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class EditAnyContact_StepDef {

    Faker faker = new Faker();
    ContactsPage contactsPage = new ContactsPage();


    @When("user clicks specific contact")
    public void user_clicks_specific_contact() {
        contactsPage.specificContactToEdit.click();
    }

    @When("user changes the contacts email")
    public void user_changes_the_contacts_email() {
        BUtility.sleep(1);
        contactsPage.addEmailAddress.clear();
        BUtility.sleep(3);
        contactsPage.addEmailAddress.sendKeys(faker.internet().emailAddress());
        assertTrue(contactsPage.addEmailAddress.isDisplayed());
    }

    @When("user changes the contacts name")
    public void user_changes_the_contacts_name() {
        BUtility.sleep(1);
        contactsPage.addFullName.clear();
        BUtility.sleep(3);
        contactsPage.addFullName.sendKeys(faker.name().fullName());
        assertTrue(contactsPage.addFullName.isDisplayed());
    }

    @When("user changes the contacts phone number")
    public void user_changes_the_contacts_phone_number() {
        contactsPage.addPhoneNumber.clear();
        BUtility.sleep(3);
        contactsPage.addPhoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        assertTrue(contactsPage.addPhoneNumber.isDisplayed());
    }


    @Then("user can verify if the contact is edited successfully")
    public void user_can_verify_if_the_contact_is_edited_successfully() {

        assertTrue(contactsPage.specificContactToEdit.isDisplayed());


    }



}
