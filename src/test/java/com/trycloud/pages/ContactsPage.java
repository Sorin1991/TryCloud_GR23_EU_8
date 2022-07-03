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

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/section/div[1]/div/div/input")
    public WebElement addPhoneNumber;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/section/div[2]/div/div/input")
    public WebElement addEmailAddress;


    public void SetContactInfo(){
        Faker faker = new Faker();

        addEmailAddress.sendKeys(faker.internet().emailAddress());
        addPhoneNumber.sendKeys(faker.phoneNumber().cellPhone());
    }



}
