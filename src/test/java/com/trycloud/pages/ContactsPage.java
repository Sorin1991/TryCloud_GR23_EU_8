package com.trycloud.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( xpath= "/html/body/header/div[1]/ul/li[7]/a")
    public WebElement contactsPageButton;

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(xpath = "//span[normalize-space(text()) = '+ New group']")
    public WebElement createNewGroupButton;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[6]/div/div[2]/div/div/button")
    public WebElement groupOptionsButton;

    @FindBy(id = "contact-fullname")
    public WebElement addFullName;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement addPhoneNumber;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement addEmailAddress;


    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement uploadPictureIcon;

    @FindBy(xpath = "//span[.='Upload a new picture']")
    public WebElement uploadNewPictureButton;

    @FindBy(xpath = "//span[.='Choose from Files']")
    public WebElement chooseFromFilesButton;

    @FindBy(xpath = "//span[.='Get from Gravatar']")
    public WebElement getFromGravatarButton;

    @FindBy(xpath = "//span[@title='Not grouped']")
    public WebElement notGroupedButton;

    @FindBy(id = "[id='contact-title']")
    public WebElement contactTitleInputBox;

    @FindBy(xpath = "//span[.='Add contacts']")
    public WebElement addContactsBtn;

    @FindBy (xpath = "//input[@class='entity-picker__search-input']")
    public WebElement searchBarToAddContactInGroup;

    @FindBy(xpath = "//button[@class='navigation__button-left']")
    public WebElement CancelButton;

    @FindBy(xpath = "//button[@class='navigation__button-right primary']")
    public WebElement addToGroupButton;

    @FindBy(xpath = "(//span[@class='user-bubble__title'])[1]")
    public WebElement selectedContact;


    @FindBy(xpath = "(//div[@class='app-content-list-item-line-one'])[2]")
    public WebElement verifyContactInList;

    @FindBy(xpath = "(//div[@class='app-content-list-item-line-one'])[5]")
    public WebElement specificContactToEdit;























}
