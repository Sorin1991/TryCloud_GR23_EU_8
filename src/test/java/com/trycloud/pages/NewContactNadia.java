package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContactNadia extends BasePage {



    @FindBy (xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']")
    public WebElement contactsPageIcon;

    @FindBy (xpath = "//button[@id='new-contact-button']")
    public WebElement newContactsButton;

    @FindBy (xpath = "//input[@id='contact-fullname']")
    public WebElement contactsFullName;

    @FindBy (xpath = "//input[@inputmode='tel']")
    public WebElement contactsTelephone;

    @FindBy (xpath = "//input[@inputmode='email']")
    public WebElement contactsEmail;

    @FindBy (xpath = "//*[@id='contacts-list']")
    public WebElement contactsList;

    @FindBy (id = "contact-title")
    public WebElement TitleSaveOption;


}
