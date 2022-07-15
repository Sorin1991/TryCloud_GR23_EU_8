package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.pages.NewContactNadia;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
    @Then("user enter full name")
    public void user_enter_full_name() {
        BUtility.waitFor(3);
        newContactNadia.contactsFullName.clear();
        Driver.getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        newContactNadia.contactsFullName.sendKeys(faker.name().fullName());
    }

    @Then("user enters telephone number")
    public void user_enters_telephone_number() {
        newContactNadia.contactsTelephone.sendKeys(faker.phoneNumber().cellPhone());
        BUtility.waitFor(5);
        newContactNadia.contactsTelephone.sendKeys(Keys.RETURN);
        BUtility.waitFor(5);
    }

    @Then("user enters email address")
    public void user_enters_email_address() {
        newContactNadia.contactsEmail.sendKeys("email.email.com");
        BUtility.waitFor(5);
        newContactNadia.contactsEmail.sendKeys(Keys.RETURN);

    }

    @Then("user should see new contacts name in the contacts list")
    public void user_should_see_new_contacts_name_in_the_contacts_list() {
        newContactNadia.contactsEmail.sendKeys(Keys.RETURN);
        BUtility.waitFor(5);
        newContactNadia.TitleSaveOption.click();
            Assert.assertTrue(newContactNadia.contactsFullName.isDisplayed());

    }

}
