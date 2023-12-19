package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopSteps {
    @And("I click on sort by position Z to A {string}")
    public void iClickOnSortByPositionZToA(String descending) {
        new DesktopPage().selectSortByOption(descending);
    }

    @Then("I can see the product will be arrange in descending order")
    public void iCanSeeTheProductWillBeArrangeInDescendingOrder() {
        new DesktopPage().verifySortedElementsInReverseOrder();
    }

    @When("I click on currency dropdown")
    public void iClickOnCurrencyDropdown() {
        new HomePage().mouseHoverOnCurrencyDropdownAndClick();
    }

    @And("I click on £pound Sterling")
    public void iClickOn£poundSterling() {
        new HomePage().mouseHoverOnPoundAndClick();
    }

    @And("I click on sort by position A to Z {string}")
    public void iClickOnSortByPositionAToZ(String ascending) {
        new DesktopPage().sortByNameAToZPosition(ascending);
    }

    @And("I select the product {string}")
    public void iSelectTheProduct(String product) {
        new DesktopPage().selectProductsOption(product);
    }

    @And("I get the text product {string}")
    public void iGetTheTextProduct(String productText) {
        Assert.assertEquals(new ProductPage().verifyProductName(), productText, "Error");
    }

    @And("I enter qty one using select class")
    public void iEnterQtyOneUsingSelectClass() {
        new ProductPage().enterQty("1");
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I get the message Success: You have added {string} to your shopping cart!")
    public void iGetTheMessageSuccessYouHaveAddedToYourShoppingCart(String product) {
        String expected = "Success: You have added " + product + " to your shopping cart!\n" +
                "×";
        String actual = new ProductPage().verifySuccessMessageToAddInCart();
        //System.out.println(actual);
        Assert.assertEquals(actual, expected, "Incorrect message");
    }

    @And("I click on shopping cart display into the success message")
    public void iClickOnShoppingCartDisplayIntoTheSuccessMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @Then("I get a text {string}")
    public void iGetAText(String shoppingCartText) {
        String cartText = new ShoppingCartPage().verifyShoppingCartText();
        System.out.println(cartText);
    }

    @Then("I get the product name {string}")
    public void iGetTheProductName(String productName) {
        Assert.assertEquals(new ShoppingCartPage().verifyProductName(), productName, "Error");
    }

    @Then("I get the model name {string}")
    public void iGetTheModelName(String modelName) {
        Assert.assertEquals(new ShoppingCartPage().verifyModel(), modelName, "Incorrect model");
    }

    @Then("I get the price {string}")
    public void iGetThePrice(String price) {
        Assert.assertEquals(new ShoppingCartPage().verifyPrice(), price, "Incorrect price");
    }
}
