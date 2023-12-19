package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement logintext;


    public String getLogintext() {
        return getTextFromElement(logintext);
    }
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computers;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics'")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparel;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloads;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement books;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelry;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCards;

//    @CacheLookup
//    @FindBy(xpath = "//a[normalize-space()='Log in'")  ////a[normalize-space()='Log in'] or class="ico-login"
//    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']") //class="ico-register")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store'] - xpath") //class="ico-register")
    WebElement logoText;
    //img[alt='nopCommerce demo store'] -css


    public void clickOnComputers(){
        clickOnElement(computers);
        log.info("click on : " + computers.toString());
    }

    public void clickOnElectronic() {
        clickOnElement(electronics);
        log.info("click on : " + electronics.toString());
    }

    public void clickOnApparel(){
        clickOnElement(apparel);
        log.info("click on : " + apparel.toString());
    }

    public void clickOnDigitalDownloads(){
        clickOnElement(digitalDownloads);
        log.info("click on : " + digitalDownloads.toString());
    }

    public void clickOnBooks(){
        clickOnElement(books);
        log.info("click on : " + books.toString());
    }

    public void clickOnJewelry(){
        clickOnElement(jewelry);
        log.info("click on : " + jewelry.toString());
    }

    public void clickOnGiftCards(){
        clickOnElement(giftCards);
        log.info("click on : " + giftCards.toString());
    }

    //public void clickOnLoginLink() { clickOnElement(loginLink); }

    public void clickOnRegister() {
        clickOnElement(register);
        log.info("click on : " + register.toString());
    }

    public String getLogoText() {
        log.info("get text from : " + logoText.toString());
        return getTextFromElement(logoText);
    }

    public String getLoginText(){
        log.info("get text from : " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

}
