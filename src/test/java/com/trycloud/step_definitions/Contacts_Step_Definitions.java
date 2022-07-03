package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginBasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contacts_Step_Definitions {

    Faker faker = new Faker();
    LoginBasePage loginBasePage = new LoginBasePage();
    ContactsPage contactsPage = new ContactsPage();




    @Given("user is on contacts page")
    public void user_is_on_contacts_page() {
        loginBasePage.loginToDashboardPage();
        contactsPage.contactsPageButton.click();
    }
    @When("user clicks + new contact button")
    public void user_clicks_new_contact_button() {
       contactsPage.newContactButton.click();
    }
    @When("user adds name to contact")
    public void user_adds_name_to_contact() {
        contactsPage.addFullName.clear();
        contactsPage.addFullName.sendKeys(faker.name().fullName());
    }
    @When("user adds email address")
    public void user_adds_email_address() {
        contactsPage.addEmailAddress.sendKeys(faker.internet().emailAddress());

    }
    @When("user adds phone number")
    public void user_adds_phone_number() {
        contactsPage.addPhoneNumber.sendKeys(faker.phoneNumber().cellPhone());
    }
    @Then("user should see new contacts name")
    public void user_should_see_new_contacts_name() {
        Assert.assertTrue(contactsPage.addFullName.isDisplayed());
    }





}
