package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
}