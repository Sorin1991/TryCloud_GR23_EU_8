package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Files_page {

    FilePage filePage = new FilePage();

    @When("user click on files tab")
    public void user_click_on_files_tab() {
        filePage.filesButton.click();


    }
    @Then("user can see files page")
    public void user_can_see_files_page() {
        String expectedPageTitle = "Files - Trycloud QA";
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualPageTitle,expectedPageTitle);



    }




}
