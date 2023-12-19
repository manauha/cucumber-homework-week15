package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        String expected = "Register";
        String actual = new RegisterPage().verifyRegisterText();
        Assert.assertEquals(actual, expected, "Register Text not displayed");
    }

    @And("I click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify message {string}")
    public void verifyMessage(String arg0) {
    }

    @Then("I should see the first name error message {string}")
    public void iShouldSeeTheFirstNameErrorMessage(String fNameMsg) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameErrorText(), fNameMsg, "First Name is required not displayed");
    }

    @And("I should see the last name error message {string}")
    public void iShouldSeeTheLastNameErrorMessage(String lNameMsg) {
        Assert.assertEquals(new RegisterPage().verifyLastNameErrorText(), lNameMsg, "Last Name is required not displayed");
    }

    @And("I should see the email error message {string}")
    public void iShouldSeeTheEmailErrorMessage(String eMsg) {
        Assert.assertEquals(new RegisterPage().verifyEmailErrorText(), eMsg, "Error is required not displayed");
    }

    @And("I should see the password error message {string}")
    public void iShouldSeeThePasswordErrorMessage(String passwordMsg) {
        Assert.assertEquals(new RegisterPage().verifyPasswordErrorText(), passwordMsg, "Password is required not displayed");
    }

    @And("I should see the confirm password message {string}")
    public void iShouldSeeTheConfirmPasswordMessage(String cPasswordMsg) {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordErrorText(), cPasswordMsg, "Confirm Password is required not displayed");
    }


    @And("I enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Neil");
    }

    @And("I enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("Cooper");
    }

    @And("I select day")
    public void iSelectDay() {
        new RegisterPage().selectDayOfBirthDay("5");
    }

    @And("I select month")
    public void iSelectMonth() {
        new RegisterPage().selectMonthOfBirthDay("May");
    }

    @And("I select year")
    public void iSelectYear() {
        new RegisterPage().selectYearOfBirthDay("2003");
    }

    @And("I enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail("ncooper18@test.com");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("Pen2paper");
    }

    @And("I enter Confirm Password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("Pen2paper");
    }

    //clickOnREGISTERButton();

    @Then("I verify message {string}")
    public void iVerifyMessage(String expectedMsg) {
        Assert.assertEquals(new RegisterPage().verifyRegistrationCompletedMessage(),expectedMsg, "Registration Incomplete");
    }

    @And("I select gender Female")
    public void iSelectGenderFemale() {
        new RegisterPage().clickOnGender();
    }
}
