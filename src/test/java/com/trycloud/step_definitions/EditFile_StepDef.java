package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage_Cemal;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.util.List;

public class EditFile_StepDef {

    FilesPage_Cemal filesPage = new FilesPage_Cemal();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    private WebDriver driver = Driver.getDriver();
    Actions actions = new Actions(driver);

    @When("User clicks and hold and carry the file to be moved and drops into target folder")
    public void user_clicks_and_hold_and_carry_the_file_to_be_moved_and_drops_into_target_folder() throws InterruptedException {

        BUtility.sleep(1);

       actions.dragAndDrop(filesPage.dragAndDropTestFile, filesPage.dragAndDropTargetFolder).perform();  // drag and drop
       // actions.clickAndHold(filesPage.dragAndDropTestFile).moveToElement(filesPage.dragAndDropTargetFolder).release().perform();

        BUtility.sleep(1);
    }

    @Then("User can see that the moved file is inside the target folder")
    public void user_can_see_that_the_moved_file_is_inside_the_target_folder() throws InterruptedException {

        filesPage.dragAndDropTargetFolder.click();

        BUtility.sleep(1);

        String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/?dir=/DragAndDropTargetFolder&fileid=8281";

        Assert.assertEquals(expectedUrl, actualUrl);  // asserting inside target folder Url

        Assert.assertTrue(filesPage.carriedFile.isDisplayed()); // asserting the file is inside the target folder


        // Moving back the moved file, in order to perform the test continiously.

        actions.contextClick(filesPage.carriedFile).perform();
        BUtility.sleep(1);
        filesPage.moveOrCopyButton.click();
        BUtility.sleep(1);
        filesPage.choseTargetFolderButton.click();
        BUtility.sleep(1);
        filesPage.moveButton.click();
    }

    @When("User right clicks the file to be deleted")
    public void user_right_clicks_the_file_to_be_deleted() {

        BUtility.sleep(2);

        actions.contextClick(filesPage.deleteTestFile).perform();

        BUtility.sleep(2);
    }

    @When("User selects the Delete File option from the dropdown")
    public void user_selects_the_delete_file_option_from_the_dropdown() {

        filesPage.deleteFileOption.click();

        BUtility.sleep(2);

    }

    @Then("User can see that the deleted file is not in the page anymore")
    public void user_can_see_that_the_deleted_file_is_not_in_the_page_anymore() {

        List<WebElement> allNamesFiles = filesPage.allNamesFiles;

        for (WebElement each : allNamesFiles) {
           // System.out.println(each.getText());
            Assert.assertNotEquals("DeleteTestFile.docx", each.getText());
        }
    }
}
