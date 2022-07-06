package com.trycloud.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//button[@aria-controls='menu-hxjdp']")
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





    public void SetContactInfo(){
        Faker faker = new Faker();

        addEmailAddress.sendKeys(faker.internet().emailAddress());
        addPhoneNumber.sendKeys(faker.phoneNumber().cellPhone());
    }



}
