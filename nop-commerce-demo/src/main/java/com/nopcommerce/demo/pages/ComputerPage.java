package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement verifyComputers;
    //h1[normalize-space()='Computers']

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement clickOnDesktops;
    //a[@title='Show products in category Desktops'][normalize-space()='Desktops']

    public String verifyComputerText(){
        log.info("get text from : " + verifyComputers.toString());
        return getTextFromElement(verifyComputers);
    }

    public void clickOnDesktops() {
        clickOnElement(clickOnDesktops);
        log.info("click on : " + clickOnDesktops.toString());
    }
    /*
    Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and create appropriate methods for it.
     */
}
