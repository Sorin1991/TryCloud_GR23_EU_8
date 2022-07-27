package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage_Cemal;
import com.trycloud.utilities.BUtility;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
