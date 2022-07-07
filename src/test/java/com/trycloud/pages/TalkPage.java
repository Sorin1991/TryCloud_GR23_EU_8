package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage {
    public TalkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//a[@href='http://qa.trycloud.net/index.php/apps/spreed/'][1])")
   public WebElement talkButton;

    @FindBy(xpath="(//input[@type='text']/..)")
    public WebElement searchConversationButton;

    @FindBy(xpath="(//div[@class='wrapper'])")
    public WebElement plusButton;

}
