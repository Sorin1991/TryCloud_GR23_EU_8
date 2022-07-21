package com.trycloud.utilities;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginBasePage;

public class UserSNameInApp extends LoginBasePage {

    public String NameUsedInApp (){

        loginToDashboardPage();
//get name user uses within the app; example: Dakota1

        HomePage homePage= new HomePage();

        String WelcomeMessageWithUSerSName = homePage.WelcomeMessageWithUserSName.getText();

        System.out.println("homePage." +
                "WelcomeMessageWithUserSName.getText() = "
                +WelcomeMessageWithUSerSName);

        int indexOfLastSpace= WelcomeMessageWithUSerSName.lastIndexOf(" ");

        String UserSNameInApp = WelcomeMessageWithUSerSName.substring(indexOfLastSpace+1);
        System.out.println("indexOfLastSpace = " + indexOfLastSpace);
        System.out.println("UserSNameInApp = " + UserSNameInApp);


        return UserSNameInApp;
    }

}
