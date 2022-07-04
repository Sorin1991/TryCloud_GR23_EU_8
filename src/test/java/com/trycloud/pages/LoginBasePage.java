package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBasePage {

    public LoginBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;


    //LOGIN METHOD FOR PRECONDITION
   // @Given("user has successfully logged in and is on the dashboard page")
   // public void userHasSuccessfullyLoggedInAndIsOnTheDashboardPage() {
       // loginBasePage.loginToDashboardPage();    }

public void loginToDashboardPage (){
    Driver.getDriver().get(ConfigurationReader.getProperty("TryCloud.url"));
    usernameBox.sendKeys(ConfigurationReader.getProperty("TryCloud.username"));
    passwordBox.sendKeys(ConfigurationReader.getProperty("TryCloud.password"));
    loginButton.click();}

}
