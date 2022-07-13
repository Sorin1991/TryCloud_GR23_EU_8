package com.trycloud.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage {
    public TalkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//li[@data-id='spreed'])[1]")
   public WebElement talkButton;


    @FindBy(css="input[placeholder='Conversation name']")
    public WebElement talkMentions;

    @FindBy(xpath="//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipants;

    @FindBy(xpath="//input[@class='set-contacts__input']")
    public WebElement searchParticipant;

    @FindBy(xpath="//div[@class='wrapper']")
    public WebElement plusButton;

    @FindBy(xpath="//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversation;

    @FindBy(xpath="//button[@class='top-bar__button top-bar__button primary']")
    public WebElement startcall;


    @FindBy (id="app-content-vue")
    public WebElement seeingScreen;



    public void nameInformation(){
        Faker faker=new Faker();
        searchParticipant.sendKeys(faker.name().fullName());
    }
}
