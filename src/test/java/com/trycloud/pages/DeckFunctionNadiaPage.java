package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeckFunctionNadiaPage extends BasePage{


    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Deck']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement deckButton;

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-add']")
    public WebElement plusBarsButton;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement allBoardsButton;
    //a[@class='app-navigation-toggle']
    //a[@class='app-navigation-toggle']

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-add']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement addTextBoardButton;

    //div[@class='board-edit']//input[@type='text']


    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement confirmAddBoardButton;

    @FindBy( )
    public WebElement test;



    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[2]/ul/li[1]/div/div/div/div/button")
    public WebElement selectOptionsBoard;

    //button[@aria-controls]
    //button[@aria-controls='menu-adutx']
    //button[@aria-controls='menu-bswrx']
    //button[@aria-controls='menu-adutx']


    @FindBy(xpath = "//span[normalize-space()='Edit board']")
    public WebElement editBoardButton;

    @FindBy(xpath = "//div[@class='board-edit']//input[@type='text']")
    public WebElement editEditBoardButton;

    @FindBy (xpath = "//input[@class='icon-confirm']")
    public WebElement confirmEditBoardButton;



    @FindBy(xpath = "//span[normalize-space()='Delete board']")
    public WebElement deleteBoardButton;

    @FindBy(xpath = "//button[@class='error primary']")
    public WebElement confirmDeleteButton;


    @FindBy(id = "user")
    public WebElement usernameBox1;

    @FindBy(id = "password")
    public WebElement passwordBox1;

    @FindBy(id = "submit-form")
    public WebElement loginButton1;
}
