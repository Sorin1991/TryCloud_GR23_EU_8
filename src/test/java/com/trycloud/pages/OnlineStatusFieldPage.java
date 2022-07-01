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



}
