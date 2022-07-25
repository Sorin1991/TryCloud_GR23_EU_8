package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Add_Files_Function_Sorin  {

    FilePage filePage = new FilePage();
    LoginBasePage loginBasePage = new LoginBasePage();
    HomePage homePage = new HomePage();




    @When("user click on add button")
    public void user_click_on_add_button() {
        filePage.addButton.click();
    }


    @When("user can see upload files option from dropDown")
    public void user_can_see_upload_files_option_from_drop_down() {

        if(filePage.uploadFilesButton.isEnabled()&&filePage.uploadFilesButton.isDisplayed()){
            System.out.println("DropDown is enabled and visible");
        }else
            System.out.println("DropDown is disabled and not visible");
        Driver.getDriver().navigate().refresh();
        BUtility.waitFor(2);

    }
    @When("user upload files")
    public void user_upload_files() {


       // filePage.uploadFilesButton.sendKeys("C:/Users/basco/Desktop/donkey.jpg");
         WebElement uploadBtn = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
         BUtility.waitFor(2);
         uploadBtn.sendKeys("C:/Users/basco/Desktop/donkey.jpg");;

//        String filePath = "donkey";
//
//
//        Robot rb = new Robot();
//
//
//        StringSelection str = new StringSelection(filePath);
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//
//
//        rb.keyPress(KeyEvent.VK_CONTROL);
//        rb.keyPress(KeyEvent.VK_V);
//
//
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//
//
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);
    }


    @Then("user can see uploaded file on the list")
    public void user_can_see_uploaded_file_on_the_list() {

        Assert.assertTrue(filePage.uploadedFile.isDisplayed());

    }






}
