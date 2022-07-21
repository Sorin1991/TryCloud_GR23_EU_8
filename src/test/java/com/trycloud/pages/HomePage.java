package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class HomePage extends LoginBasePage {




    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement avatar;


    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement avatarDropdownStatusOption;


    @FindBy(xpath = "//div[@class='modal-container']")
    public  WebElement onlineStatusPopUpWindow;


    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement onlineStatusField;


    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesIcon;

    @FindBy(id = "appmenu")
    public WebElement topLeftIconMenu;


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement fileIcon;


    //<h2 data-v-d8d86ca2="">Good afternoon, Dakota1</h2>
    @FindBy(xpath = "//div[@id=\"app-dashboard\"]/h2")
    public WebElement WelcomeMessageWithUserSName;
}
