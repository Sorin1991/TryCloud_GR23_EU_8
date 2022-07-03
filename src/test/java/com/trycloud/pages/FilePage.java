package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {

    public FilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesButton;

   // @FindBy(css = "#appmenu li[data-id='files'] a")
   // public WebElement elementLink;



}
