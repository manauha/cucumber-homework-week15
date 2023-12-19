package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    /**
     * startNowButton locators and create method 'void clickStartNow()'
     */
//========================== Locators ============================//
    //Accept Cookies Btn
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookiesBtn;

    //StartNow Btn
    @CacheLookup
    @FindBy(css = ".gem-c-button.govuk-button.govuk-button--start")
    WebElement startNowBtn;

//======================== Methods ================================//

    //Click on Accept Cookies Button
    public void mouseHoverAndClickOnAcceptCookiesBtn() {
        mouseHoverToElementAndClick(acceptCookiesBtn);
        log.info("mouse hover and click on : " + acceptCookiesBtn.toString());
    }

    //  Click on start button
    public void mouseHoverAndClickOnStartBtn() {
        mouseHoverToElementAndClick(startNowBtn);
        log.info("mouse hover and click on : " + startNowBtn.toString());
    }
}
