package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFunctionNadiaPage extends BasePage {

    @FindBy (xpath = "//ul[@class='app-navigation__list']")
    public WebElement clearSection;

    @FindBy (xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    public WebElement newGroupIcon;

    @FindBy (xpath = "//input[@class='action-input__input focusable']")
    public WebElement newGroupName;

    @FindBy (xpath = "//label[@for='action-bruig']")
    public WebElement newGroupNameConfirm;

    @FindBy (xpath = "//span[@title='Group One']")
    public WebElement newGroupNameDisplayed;





    @FindBy (xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']")
    public WebElement contactsPageIcon;

    @FindBy (xpath = "//button[@id='new-contact-button']")
    public WebElement newContactsButton;

    @FindBy (name = "fullname")
    public WebElement contactsFullName;

    @FindBy (xpath = "//input[@inputmode='tel']")
    public WebElement contactsTelephone;

    @FindBy (xpath = "//input[@inputmode='email']")
    public WebElement contactsEmail;

    @FindBy (xpath = "//*[@id='contacts-list']")
    public WebElement contactsList;

    @FindBy (id = "contact-title")
    public WebElement TitleSaveOption;

    @FindBy (xpath = "//div[@class='app-content-list-item-line-one']")
    public WebElement selectsFirstContact;

    @FindBy (xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[2]/header[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
    public WebElement selectThreeLinesIcon;
    //button[@aria-controls='menu-ikjpi']


    @FindBy (xpath = "//li[@class='action active']//button[@class='action-button focusable']")
    public WebElement deleteContact;




}
