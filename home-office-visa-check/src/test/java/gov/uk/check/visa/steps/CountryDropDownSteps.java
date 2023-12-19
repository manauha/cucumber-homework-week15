package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountryDropDownSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @And("I accept the cookies")
    public void iAcceptTheCookies() {
        new StartPage().mouseHoverAndClickOnAcceptCookiesBtn();}

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().mouseHoverAndClickOnStartBtn();
    }

    @Then("I can see following {string} into dropdown")
    public void iCanSeeFollowingIntoDropdown(String country ) {
        new SelectNationalityPage().selectANationalityFromDropDownList(country);
        System.out.println(country + " is in the dropdown list");
    }

}

