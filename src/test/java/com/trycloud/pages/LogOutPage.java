package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends BasePage{

    @FindBy (xpath = "//div[@class='avatardiv avatardiv-shown']//img")
    public WebElement userImageIcon;

    @FindBy (xpath = "//a[normalize-space()='Log out']")
    public WebElement logOutButton;

    @FindBy (id = "user")
    public WebElement homePage;

}
