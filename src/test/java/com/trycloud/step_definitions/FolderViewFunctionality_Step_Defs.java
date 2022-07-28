package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage_Cemal;
import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginBasePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class FolderViewFunctionality_Step_Defs {

    LoginBasePage loginBasePage = new LoginBasePage();
    HomePage homePage = new HomePage();
    FilesPage_Cemal filesPage = new FilesPage_Cemal();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @When("User is on the Files page")
    public void user_is_on_the_files_page() {
        loginBasePage.loginToDashboardPage();
        homePage.filesIcon.click();

    }

    @When("User clicks the Names sort icon")
    public void user_clicks_the_names_ikon() {
        filesPage.namesSortButton.click();

    }

    @Then("User can see that the files are arranged according to the alphabetical order")
    public void user_can_see_that_the_files_are_arranged_according_to_the_alphabetical_order() {

        List<WebElement> allNames = filesPage.allNames;

        List<WebElement> allNamesDirectories = filesPage.allNamesDirectories;

        List<WebElement> allNamesFiles = filesPage.allNamesFiles;


       List<String> allNamesDirectories1 = new ArrayList<>();

        for (WebElement each : allNamesDirectories) {
            allNamesDirectories1.add(each.getText().toLowerCase());
        }

        Collections.sort(allNamesDirectories1);

       // System.out.println("allNamesDirectories1 = " + allNamesDirectories1);

        List<WebElement> allNamesDirectoriesB = filesPage.allNamesDirectories;

        List<String> allNamesDirectories2 = new ArrayList<>();

        for (WebElement each : allNamesDirectoriesB) {
          allNamesDirectories2.add(each.getText().toLowerCase());
        }

       //  System.out.println("allNamesDirectories2 = " + allNamesDirectories2);


        Assert.assertTrue(allNamesDirectories1.equals(allNamesDirectories2));


        List<String>allNamesFiles1 = new ArrayList<>();

        for (WebElement each : allNamesFiles) {
            allNamesFiles1.add(each.getText().toLowerCase());
        }
         Collections.sort(allNamesFiles1);

       // System.out.println("allNamesFiles1 = " + allNamesFiles1);


        List<WebElement>allNamesFilesB = filesPage.allNamesFiles;

        List<String>allNamesFiles2 = new ArrayList<>();

        for (WebElement each : allNamesFilesB) {
           allNamesFiles2.add(each.getText().toLowerCase());
        }

       // System.out.println("allNamesFiles2 = " + allNamesFiles2);

        Assert.assertTrue(allNamesFiles1.equals(allNamesFiles2));

    }

    @Then("User can see that the files are arranged according to the reverse alphabetical order")
    public void user_can_see_that_the_files_are_arranged_according_to_the_reverse_alphabetical_order() {

        List<WebElement> allNames = filesPage.allNames;

        List<WebElement> allNamesDirectories = filesPage.allNamesDirectories;

        List<WebElement> allNamesFiles = filesPage.allNamesFiles;


        List<String> allNamesDirectories1 = new ArrayList<>();

        for (WebElement each : allNamesDirectories) {
            allNamesDirectories1.add(each.getText().toLowerCase());
        }

        Collections.sort (allNamesDirectories1);
        Collections.reverse (allNamesDirectories1);

       // System.out.println("allNamesDirectories1 = " + allNamesDirectories1);

        List<WebElement> allNamesDirectoriesB = filesPage.allNamesDirectories;

        List<String> allNamesDirectories2 = new ArrayList<>();

        for (WebElement each : allNamesDirectoriesB) {
            allNamesDirectories2.add(each.getText().toLowerCase());
        }

        //System.out.println("allNamesDirectories2 = " + allNamesDirectories2);


        Assert.assertTrue(allNamesDirectories1.equals(allNamesDirectories2));


        List<String>allNamesFiles1 = new ArrayList<>();

        for (WebElement each : allNamesFiles) {
            allNamesFiles1.add(each.getText().toLowerCase());
        }
        Collections.sort(allNamesFiles1);
        Collections.reverse(allNamesFiles1);

        //System.out.println("allNamesFiles1 = " + allNamesFiles1);

        List<WebElement>allNamesFilesB = filesPage.allNamesFiles;

        List<String>allNamesFiles2 = new ArrayList<>();

        for (WebElement each : allNamesFilesB) {

            allNamesFiles2.add(each.getText().toLowerCase());
        }

        // System.out.println("allNamesFiles2 = " + allNamesFiles2);

        Assert.assertTrue(allNamesFiles1.equals(allNamesFiles2));

    }

    @When("User clicks the Size sort icon")
    public void user_clicks_the_size_sort_icon() {
        filesPage.sizeSortButton.click();

    }

    @Then("User can see that the files are arranged according to the size from smaller to larger")
    public void user_can_see_that_the_files_are_arranged_according_to_the_size_from_smaller_to_larger() {

        List<WebElement>allSizes = filesPage.allSizes;

        List<String>allSizesTexts = new ArrayList<>();

        for (WebElement each : allSizes) {
            allSizesTexts.add(each.getText());
        }

       // System.out.println("allSizesTexts = " + allSizesTexts);

        List<Integer>list= new ArrayList<>();
        List<Double>listMB = new ArrayList<>();
        List<Integer>listKB = new ArrayList<>();


        for (int i = 0; i <= allSizesTexts.size()-2; i++) {
            String str = allSizesTexts.get(i);
            if(str.substring(str.length()-2).equals("MB")){
                list.add(2);
                listMB.add(Double.valueOf(str.substring(0,str.indexOf(" "))));
            }else{
                list.add(1);
                if (str.startsWith("<")){
                    listKB.add(Integer.valueOf(str.substring(2, str.lastIndexOf(" "))));
                }else{
                    listKB.add(Integer.valueOf(str.substring(0,str.lastIndexOf(" "))));
                }
            }
        }

       // System.out.println("list = " + list);
       // System.out.println("listKB = " + listKB);
        //System.out.println("listMB = " + listMB);

        for (int i = 0; i <= list.size()-2; i++) {
            Assert.assertTrue(list.get(i) <= list.get(i+1));
        }

        if (listMB.size()>1){
            for (int i = 0; i <= listMB.size()-2; i++) {
                Assert.assertTrue(listMB.get(i) <= listMB.get(i+1));
            }
        }

        if(listKB.size()>1){
            for (int i = 0; i <= listKB.size()-2; i++) {
                Assert.assertTrue(listKB.get(i) <= listKB.get(i+1));
            }
        }

    }

    @Then("User can see that the files are arranged according to the size from from larger to smaller")
    public void user_can_see_that_the_files_are_arranged_according_to_the_size_from_from_larger_to_smaller() {

        List<WebElement>allSizes = filesPage.allSizes;

        List<String>allSizesTexts = new ArrayList<>();

        for (WebElement each : allSizes) {
            allSizesTexts.add(each.getText());
        }

       // System.out.println("allSizesTexts = " + allSizesTexts);

        List<Integer>list= new ArrayList<>();
        List<Double>listMB = new ArrayList<>();
        List<Integer>listKB = new ArrayList<>();


        for (int i = 0; i <= allSizesTexts.size()-2; i++) {
            String str = allSizesTexts.get(i);
            if(str.substring(str.length()-2).equals("MB")){
                list.add(2);
                listMB.add(Double.valueOf(str.substring(0,str.indexOf(" "))));
            }else{
                list.add(1);
                if (str.startsWith("<")){
                listKB.add(Integer.valueOf(str.substring(2, str.lastIndexOf(" "))));
                 }else{
                listKB.add(Integer.valueOf(str.substring(0,str.lastIndexOf(" "))));
                }
            }
        }

       /* System.out.println("list = " + list);
        System.out.println("listKB = " + listKB);
        System.out.println("listMB = " + listMB);

        */



        for (int i = 0; i <= list.size()-2; i++) {
            Assert.assertTrue(list.get(i) >= list.get(i+1));
        }

        if (listMB.size()>1){
            for (int i = 0; i <= listMB.size()-2; i++) {
                Assert.assertTrue(listMB.get(i) >= listMB.get(i+1));
            }
        }

        if(listKB.size()>1){
            for (int i = 0; i <= listKB.size()-2; i++) {
                Assert.assertTrue(listKB.get(i) >= listKB.get(i+1));
            }
        }




        //System.out.println("list = " + list);

        for (int i = 0; i < list.size()-1; i++) {

            Assert.assertTrue(list.get(i) >= list.get(i+1));
        }

    }

    @When("User clicks the Modified sort icon")
    public void user_clicks_the_modified_sort_icon() {
        filesPage.modifiedSortButton.click();

    }

    @Then("User can see that the files are arranged according to the Date of Modification from earlier to later")
    public void user_can_see_that_the_files_are_arranged_according_to_the_date_of_modification_from_earlier_to_later() {

        List<WebElement> allDates = filesPage.allDates;
       // System.out.println("allDates.size() = " + allDates.size());

        List<String> allDatesTexts = new ArrayList<>();


        for (WebElement each : allDates) {
            String str = each.getText();
            allDatesTexts.add(str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")));
        }

           // System.out.println("allDatesTexts = " + allDatesTexts);

        List<Integer> list = new ArrayList<>();

        for (String each : allDatesTexts) {
            if (each.equals("seconds")){
                list.add(1);
            }else if (each.equals("minute")){
                list.add(2);
            }else if (each.equals("minutes")){
                list.add(3);
            }else if (each.equals("hour")){
                list.add(4);
            }else if (each.equals("hours")){
                list.add(5);
            }else if (each.equals("day")){
                list.add(6);
            }else if (each.equals("days")){
                list.add(7);
            }else if (each.equals("month")){
                list.add(8);
            }else
                list.add(9);
            }

       // System.out.println("list = " + list);

        for (int i = 0; i < list.size()-2; i++) {

            Assert.assertTrue(list.get(i) <= list.get(i+1));
        }
    }

    @Then("User can see that the files are arranged according to the Date of Modification from later to earlier")
    public void user_can_see_that_the_files_are_arranged_according_to_the_date_of_modification_from_later_to_earlier() {

        List<WebElement> allDates = filesPage.allDates;
        // System.out.println("allDates.size() = " + allDates.size());

        List<String> allDatesTexts = new ArrayList<>();


        for (WebElement each : allDates) {
            String str = each.getText();
            allDatesTexts.add(str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")));
        }

        // System.out.println("allDatesTexts = " + allDatesTexts);

        List<Integer> list = new ArrayList<>();

        for (String each : allDatesTexts) {
            if (each.equals("seconds")){
                list.add(1);
            }else if (each.equals("minute")){
                list.add(2);
            }else if (each.equals("minutes")){
                list.add(3);
            }else if (each.equals("hour")){
                list.add(4);
            }else if (each.equals("hours")){
                list.add(5);
            }else if (each.equals("day")){
                list.add(6);
            }else if (each.equals("days")){
                list.add(7);
            }else if (each.equals("month")){
                list.add(8);
            }else
                list.add(9);
        }

        // System.out.println("list = " + list);

        for (int i = 0; i < list.size()-2; i++) {

            Assert.assertTrue(list.get(i) >= list.get(i+1));
        }

    }

}
