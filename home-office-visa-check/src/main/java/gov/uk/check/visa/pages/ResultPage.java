package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    /**
     * resultMessage locator and create methods 'String getResultMessage()'
     * and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
     */
    //========================== Locators ============================//

    //Result Message For Australia
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageForAustralia;

    //Result Message For HCP
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageForHCP;

    //Result Message For Visa Status
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultMessageForVisaStatus;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement needAVisa;


    //======================== Methods ================================//

    //	verify result 'You will not need a visa to come to the UK'
    public String verifyResultMessageForAustralia() {
        log.info("get text from : " + resultMessageForAustralia.toString());
        return getTextFromElement(resultMessageForAustralia);
    }

    //	verify result 'You need a visa to work in health and care'
    public String verifyResultMessageForHCP() {
        log.info("get text from : " + resultMessageForHCP.toString());
        return getTextFromElement(resultMessageForHCP);
    }

    //	verify result 'You’ll need a visa to join your family or partner in the UK'
    public String verifyResultMessageForVisaStatus(){
        log.info("get text from : " + resultMessageForVisaStatus.toString());
        return getTextFromElement(resultMessageForVisaStatus);
    }

    public String getYouMayNeedAVisaText(){
        log.info("get text from : " + needAVisa.toString());
        return getTextFromElement(needAVisa);
    }


}
