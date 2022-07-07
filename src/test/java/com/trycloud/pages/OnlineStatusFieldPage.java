package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusFieldPage {

    public OnlineStatusFieldPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[1]")
    public WebElement online;

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[2]")
    public WebElement away;

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[3]")
    public WebElement doNotDisturb;

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[4]")
    public WebElement invisible;

    @FindBy(xpath = "//span[@hidden='hidden']")
    public  WebElement closeSign;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatusMessageButton;

    public WebElement getStatusOption(String option){
        WebElement result;
        if(option.equalsIgnoreCase("online")){
            return online;
        }else if(option.equalsIgnoreCase("away")){
            return away;
        }else if(option.equalsIgnoreCase("Invisible")){
            return invisible;
        }else{
            return doNotDisturb;
        }
    }

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement onlineOptionTextInTheStatusField;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement awayOptionTextInTheStatusField;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-invisible']")
    public WebElement invisibleOptionTextInTheStatusField;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-dnd']")
    public WebElement doNotDisturbOptionTextInTheStatusField;



    public WebElement getDisplayedStatus(String option){
        if(option.equalsIgnoreCase("Online")){
            return onlineOptionTextInTheStatusField;
        }else if(option.equalsIgnoreCase("Away")){
            return awayOptionTextInTheStatusField;
        }else if(option.equalsIgnoreCase("Invisible")){
            return invisibleOptionTextInTheStatusField;
        }else {
            return doNotDisturbOptionTextInTheStatusField;
        }
    }



}
