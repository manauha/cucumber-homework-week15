package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    //h1[normalize-space()='Register']

    public String verifyRegisterText(){
        return getTextFromElement(registerText);
    }

        /*
    Register Text, male female radio, Firstname, lastname, Date of Birth drop down, email, Password, Confirm Password,
     Register Button, "First name is required.","Last name is required.", "Email is required.","Password is required.",
      "Password is required." error message,
"Your registration completed" message, "CONTINUE" button
Locators and it's actions
     */

//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Register']")
//    WebElement registerText;
//    //h1[normalize-space()='Register']

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    //button[@id='register-button'] //button[@id='register-button']

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;
    //span[@id='FirstName-error']

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;
    //span[@id='LastName-error']

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;
    //span[@id='Email-error']

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;
    //span[@id='Password-error']

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;
    //span[@id='ConfirmPassword-error']

    @CacheLookup
    @FindBy(xpath ="//input[@id='gender-female']")
    WebElement genderFemale;
    //input[@id='gender-female']  //-To select female gender

    @CacheLookup
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement enterFirstName;
    //input[@id='FirstName']      //-To enter FirstName

    @CacheLookup
    @FindBy(xpath ="//input[@id='LastName']")
    WebElement enterLastName;
    //input[@id='LastName']       //-To enter LastName

    @CacheLookup
    @FindBy(xpath ="//select[@name='DateOfBirthDay']")
    WebElement dayOfBirthDate;
    //select[@name='DateOfBirthDay']  //- To select date of DOB

    @CacheLookup
    @FindBy(xpath ="//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthDate;
    //select[@name='DateOfBirthMonth'] // - To select month of DOB

    @CacheLookup
    @FindBy(xpath ="//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthDate;
    //select[@name='DateOfBirthYear']  // - To select year of DOB

    @CacheLookup
    @FindBy(xpath ="//input[@id='Email']")
    WebElement enterEmail;
    //input[@id='Email']              // - To input Email ID

    @CacheLookup
    @FindBy(xpath ="//input[@id='Password'] ")
    WebElement enterPassword;
    //input[@id='Password']            // - To input Password

    @CacheLookup
    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;
    //input[@id='ConfirmPassword']      // - To input ConfirmPassword

    @CacheLookup
    @FindBy(xpath ="//div[@class='result']")
    WebElement registrationCompleted;
    //div[@class='result']   //Your registration completed

    public String verifyRegistrationCompletedMessage(){
        log.info("get text from : "+ registrationCompleted.toString());
        return getTextFromElement(registrationCompleted);
    }

    public void clickOnGender(){
        clickOnElement(genderFemale);
        log.info("click on : " + genderFemale.toString());
    }

    public void enterFirstName(String firstName){
        sendTextToElement(enterFirstName, firstName);
        log.info("send text to : " + enterFirstName.toString());
    }

    public void enterLastName(String lastName){
        sendTextToElement(enterLastName, lastName);
        log.info("send text to : " + enterLastName.toString());
    }

    public void selectDayOfBirthDay(String day){
        selectByVisibleTextFromDropDown(dayOfBirthDate,day);
        log.info("send text to : " + dayOfBirthDate.toString());
    }

    public void selectMonthOfBirthDay(String month){
        selectByVisibleTextFromDropDown(monthOfBirthDate,month);
        log.info("send text to : " + monthOfBirthDate.toString());
    }

    public void selectYearOfBirthDay(String year){
        selectByVisibleTextFromDropDown(yearOfBirthDate,year);
        log.info("send text to : " + yearOfBirthDate.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, email);
        log.info("send text to : " + enterEmail.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("send text to : " + enterPassword.toString());
    }

    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(enterConfirmPassword, confirmPassword);
        log.info("send text to : " + enterConfirmPassword.toString());
    }

//    public String verifyRegisterText(){
//    log.info("get text from : " + registerText.toString());
//        return getTextFromElement(registerText);
//    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        log.info("click on : " + registerButton.toString());
    }

    public String verifyFirstNameErrorText(){
        log.info("get text from : " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameErrorText(){
        log.info("get text from : " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyEmailErrorText(){
        log.info("get text from : " + emailError.toString());
        return getTextFromElement(emailError);
    }
    public String verifyPasswordErrorText(){
        log.info("get text from : " + passwordError.toString());
        return getTextFromElement(passwordError);
    }
    public String verifyConfirmPasswordErrorText(){
        log.info("get text from : " + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }
}
