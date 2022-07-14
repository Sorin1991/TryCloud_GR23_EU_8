package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.BUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Create_New_Contact_StepDefs {

    Faker faker = new Faker();
    LoginBasePage loginBasePage = new LoginBasePage();
    ContactsPage contactsPage = new ContactsPage();




    @Given("user is on contacts page")
    public void user_is_on_contacts_page() {
        loginBasePage.loginToDashboardPage();
        contactsPage.contactsPageButton.click();
        BUtility.sleep(2);
        Assert.assertTrue(contactsPage.contactsPageButton.isDisplayed());
    }
    @When("user clicks + new contact button")
    public void user_clicks_new_contact_button() {
       contactsPage.newContactButton.click();
    }
    @And("user adds name to contact")
    public void userAddsToContact() {
        contactsPage.addFullName.clear();
        BUtility.sleep(2);
        contactsPage.addFullName.sendKeys("Test Tester");
        
    }


    @And("user adds email address")
    public void userAddsAddress() {
        BUtility.sleep(2);
        contactsPage.addEmailAddress.sendKeys("test@email.com");
        
    }


    @And("user adds phone number")
    public void userAdds() {
        BUtility.sleep(2);
        contactsPage.addPhoneNumber.sendKeys("+1233456789");
    }


    @Then("user should see new contacts name")
    public void user_should_see_new_contacts_name() {
        BUtility.sleep(2);
        Assert.assertTrue(contactsPage.addFullName.isDisplayed());
    }



}
