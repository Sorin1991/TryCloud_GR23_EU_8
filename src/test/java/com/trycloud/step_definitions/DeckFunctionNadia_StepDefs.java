package com.trycloud.step_definitions;

import com.trycloud.pages.DeckFunctionNadiaPage;
import com.trycloud.pages.LoginBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeckFunctionNadia_StepDefs {

    LoginBasePage loginBasePage = new LoginBasePage();
    DeckFunctionNadiaPage deckFunctionNadiaPage = new DeckFunctionNadiaPage();


    @Given("user is on the Deck module")
    public void userIsOnTheDeckModule() {
        loginBasePage.loginToDashboardPage();
        deckFunctionNadiaPage.deckButton.click();
    }

    @Then("user clicks on the three bars button")
    public void user_clicks_on_the_three_bars_button() {
        deckFunctionNadiaPage.threeBarsButton.click();
    }

    @Then("user clicks on all boards to view all boards")
    public void userClicksOnAllBoardsToViewAllBoards() {
        deckFunctionNadiaPage.allBoardsButton.click();
    }

    @Then("user click on the Add board button")
    public void userClickOnTheAddBoardButton() {
        deckFunctionNadiaPage.addBoardButton.click();
    }

    @And("user can create a new board name {string}")
    public void userCanCreateANewBoardNameName(String string) {
        deckFunctionNadiaPage.addTextBoardButton.sendKeys(string);
        deckFunctionNadiaPage.confirmAddBoardButton.click();
    }

    @Then("user is able to edit an existing board")
    public void userIsAbleToEditAnExistingBoard() {
        deckFunctionNadiaPage.selectOptionsBoard.click();
        deckFunctionNadiaPage.editBoardButton.click();
        deckFunctionNadiaPage.editEditBoardButton.sendKeys(" editTEST");
        deckFunctionNadiaPage.confirmEditBoardButton.click();


    }

    @And("the user is able to delete an existing board")
    public void theUserIsAbleToDeleteAnExistingBoard() {
        deckFunctionNadiaPage.selectOptionsBoard.click();
        deckFunctionNadiaPage.deleteBoardButton.click();
        deckFunctionNadiaPage.confirmDeleteButton.click();


    }
}