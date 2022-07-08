package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContactNadia {

    public NewContactNadia(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="new-contact-button")
    public WebElement newContactsButton;

    @FindBy (id="contact-fullname")
    public WebElement contactsFullName;

    @FindBy (xpath = "//input[@inputmode='tel']")
    public WebElement contactsTelephone;

    @FindBy (xpath = "//input[@inputmode='email']")
    public WebElement contactsEmail;


}
