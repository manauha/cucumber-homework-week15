package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    /**
     * nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
     * 'void selectLengthOfStay(String moreOrLess)'
     * (Note: use switch statement for select moreOrLess stay)
     * and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space() = '6 months or less')]")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    //======================== Methods ================================//


    public void clickOnLongerThan6Months(){
        clickOnElement(moreThanSixMonths);
        log.info("click on : " + moreThanSixMonths.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("click on : " + nextStepButton.toString());
    }

}







