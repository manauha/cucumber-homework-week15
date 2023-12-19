package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class AccountPage extends Utility {

   private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreation;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement continueAccountButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement accountLogOutText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueLogOutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement checkTextForMyAccount;

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement clickOnOption;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement clickOnMyAccount;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement accountLink;


    public String verifyTheMessageYourAccountHasBeenCreated() {
        String account = getTextFromElement(accountCreation);
       log.info("Get text : " + accountCreation.toString());
        return account;
    }

    public void clickOnContinueAccountButton() {
        clickOnElement(continueAccountButton);
       log.info("Clicking on : " + continueAccountButton.toString());
    }

    public String verifyTextForAccountLogOut() {
        String accountLogout = getTextFromElement(accountLogOutText);
        log.info("Get text from : " + accountLogOutText.toString());
        return accountLogout;
    }

    public void clickOnContinueLogOutButton() {
        clickOnElement(continueLogOutButton);
        log.info("Clicking on : " + continueLogOutButton.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
       log.info("Clicking on : " + loginButton.toString());
    }

    public String verifyTheTextMyAccount() {
        String myAccount = getTextFromElement(checkTextForMyAccount);
        log.info("Get text from : " + checkTextForMyAccount.toString());
        return myAccount;
    }

//    public void selectMyAccountOptions(String option) {
//        listOfProductsElement(clickOnOption, option);
//    }

    public void selectOption(String option) {
        WebElement menuList = driver.findElement(By.linkText(option));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();
       log.info("get array list : " + option + menuList.toString());
    }

    public void clickOnMyAccountLink() {
        mouseHoverToElementAndClick(clickOnMyAccount);
        log.info("Clicking on : " + clickOnMyAccount.toString());
    }

//    public void clickOnMyAccount() {
//        // Implement a method to wait for the element to be present before clicking
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.presenceOfElementLocated((By) accountLink)).click();
//    }

}
