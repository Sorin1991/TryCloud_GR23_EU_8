package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.ContactsPage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EditAnyContact_StepDef {

    Faker faker = new Faker();
    ContactsPage contactsPage = new ContactsPage();


    @When("user clicks specific contact")
    public void user_clicks_specific_contact() {
        contactsPage.specificContactToEdit.click();
    }

    @When("user changes the contacts {string}")
    public void user_changes_the_contacts_email(String newEmailAddress) {
        newEmailAddress = "test@test.com";
        BUtility.sleep(2);
        contactsPage.addEmailAddress.clear();
        BUtility.sleep(3);
        contactsPage.addEmailAddress.clear();
        contactsPage.addEmailAddress.sendKeys(newEmailAddress);
        BUtility.sleep(3);
        String actualEmailAddress = contactsPage.oldEmailAddress.getAttribute("href").substring(7);


        assertEquals(newEmailAddress, actualEmailAddress);
    }

    @When("user changes the contacts {string}")
    public void user_changes_the_contacts_name(String newName) {



        BUtility.sleep(1);
        newName = "Aysoltan Aysoltan";
        contactsPage.addFullName.clear();
        BUtility.sleep(3);
        contactsPage.addFullName.sendKeys(newName);
        BUtility.sleep(3);


    }

    @When("user changes the contacts phone {string}")
    public void user_changes_the_contacts_phone_number(String newNumber) {
         newNumber = "+4412345678";

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(contactsPage.addPhoneNumber).perform();
        contactsPage.addPhoneNumber.clear();

        BUtility.sleep(5);

        contactsPage.addPhoneNumber.sendKeys(newNumber);
        String actualNumber = contactsPage.actualPhoneNumber.getAttribute("href").substring(4);
        BUtility.sleep(3);
        assertEquals(newNumber, actualNumber);

    }


    @Then("user can verify if the contact is edited successfully")
    public void user_can_verify_if_the_contact_is_edited_successfully() {

        assertTrue(contactsPage.specificContactToEdit.isDisplayed());


    }



}
