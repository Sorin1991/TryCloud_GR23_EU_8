package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Files_page_Step_Definitions {

    FilePage filePage = new FilePage();

    @When("user click on files tab")
    public void user_click_on_files_tab() {
        BUtility.waitFor(2);
        filePage.filesButton.click();


    }
    @Then("user can see files page")
    public void user_can_see_files_page() {
        String expectedPageTitle = "Files - Trycloud QA";
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualPageTitle,expectedPageTitle);

    }

    @When("user click on add button")
    public void user_click_on_add_button() {
        filePage.addButton.click();

    }
    @Then("user can upload files")
    public void user_can_upload_files() throws AWTException {
        filePage.uploadFilesButton.click();

        //filePage.uploadFilesButton.sendKeys("C:/Users/basco/Desktop/donkey.jpg");
       // WebElement uploadBtn = Driver.getDriver().findElement(By.cssSelector("label[for='file_upload_start']"));
       // uploadBtn.click();
        String filePath = "donkey";


        Robot rb = new Robot();


        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }




}
