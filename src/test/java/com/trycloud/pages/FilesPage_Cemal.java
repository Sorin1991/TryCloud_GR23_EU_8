package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage_Cemal {

    public FilesPage_Cemal(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='name sort columntitle']/span[.='Name']")
    public WebElement namesSortButton;

    @FindBy(xpath = "//a[@class='size sort columntitle']/span[.='Size']")
    public WebElement sizeSortButton;

    @FindBy(xpath = "//a[@id='modified']/span[.='Modified']")
    public WebElement modifiedSortButton;

   @FindAll({
           @FindBy(xpath = "//td[@class = 'date']/span")
   })
    public List<WebElement> allDates;

   @FindAll({
           @FindBy(xpath = "//td[@class='filesize']")
   })
    public List<WebElement>allSizes;

   @FindAll({
           @FindBy(xpath = "//span[@class='innernametext']")
   })
    public List<WebElement> allNames;

   @FindAll({
           @FindBy(xpath = "//tr[@data-type='dir']//span[@class='innernametext']")
   })
    public  List<WebElement> allNamesDirectories;

    @FindAll({
            @FindBy(xpath = "//tr[@data-type='file']//span[@class='nametext']")
    })
    public List<WebElement> allNamesFiles;

    @FindBy (xpath = "//tr[@data-file='DragAndDropTargetFolder']")
    public WebElement dragAndDropTargetFolder;

    @FindBy (xpath = "//tr[@data-id='8293']")
    public WebElement dragAndDropTestFile;

    @FindBy(xpath = "//span[.='DragAndDropTestFile']")
    public WebElement carriedFile;

    @FindBy(xpath = "//label[@for = 'select-files-8293']")
    public WebElement checkBox;

    @FindBy(xpath= "//a[@class='menu-option option-movecopy']")
    public WebElement moveOrCopyButton;

    @FindBy(xpath = "//div[@class='crumb']")
    public WebElement choseTargetFolderButton;

    @FindBy(xpath = "//button[.='Move']")
    public WebElement moveButton;


}
