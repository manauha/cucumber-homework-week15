package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;
    //h1[normalize-space()='Desktops']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;
    //a[normalize-space()='Build your own computer']

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
        log.info("click on : " + buildYourOwnComputer.toString());
    }

    public String verifyDesktopsText(){
        log.info("get text from : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }


    /*
    Desktops text, Sortby, Display, selectProductList Locators and it's actions
     */
}
