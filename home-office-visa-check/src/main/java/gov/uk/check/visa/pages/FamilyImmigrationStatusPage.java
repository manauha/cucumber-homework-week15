package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    /**
     * nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
     * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement yesRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnForFamilyImmigrationStatusPage;

    //======================== Methods ================================//

    //	Select state My partner of family member have uk immigration status 'yes'
    public void selectStateOfUkImmigrationAsYes(String text){
        mouseHoverToElementAndClick(yesRadioBtn);
        log.info("mouse hove and click on : " +  yesRadioBtn.toString() );
    }
    //	Click on Continue button
    public void mouseHoverAndClickOnContinueBtnForFamilyImmigrationStatusPage(){
        mouseHoverToElementAndClick(continueBtnForFamilyImmigrationStatusPage);
        log.info("mouse hove and click on : " +  continueBtnForFamilyImmigrationStatusPage.toString() );
    }
}
