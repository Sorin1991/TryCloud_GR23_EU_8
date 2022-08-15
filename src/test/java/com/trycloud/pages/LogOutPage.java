package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{

    @FindBy (xpath = "//div[@class='avatardiv avatardiv-shown']//img")
    public WebElement userImageIcon;

    @FindBy (xpath = "//a[normalize-space()='Log out']")
    public WebElement logOutButton;

    @FindBy (id = "user")
    public WebElement homePage;

}
