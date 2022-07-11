package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.NewContactNadia;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewContactsNadia_StepDefs {

    LoginBasePage loginBasePage = new LoginBasePage();
    NewContactNadia newContactNadia = new NewContactNadia();
    Faker faker = new Faker();

    @Given("user is on the contacts page")
    public void user_is_on_the_contacts_page() {
        loginBasePage.loginToDashboardPage();
        newContactNadia.contactsPageIcon.click();
    }

    @Then("user clicks on new contact button")
    public void user_clicks_on_new_contact_button() {
        newContactNadia.newContactsButton.click();

    }

    @Then("user enters telephone number")
    public void user_enters_telephone_number() {
        newContactNadia.contactsTelephone.sendKeys(faker.phoneNumber().cellPhone());

    }
    @Then("user enters email address")
    public void user_enters_email_address() {
        newContactNadia.contactsEmail.sendKeys(faker.internet().emailAddress());
    }

    @Then("user enter full name")
    public void user_enter_full_name() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5000,5000);
        newContactNadia.contactsFullName.sendKeys(faker.name().fullName());
    }


    @Then("user should see new contacts name in the contacts list")
    public void user_should_see_new_contacts_name_in_the_contacts_list() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5000,5000);

        newContactNadia.newContactsButton.click();
        Assert.assertTrue(newContactNadia.contactsFullName.isDisplayed());

    }

}
