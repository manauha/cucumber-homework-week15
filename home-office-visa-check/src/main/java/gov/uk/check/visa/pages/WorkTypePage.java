package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    /**
     * nextStepButton, selectJobtypeList locators and create methods 'void selectJobType(String job)'
     * and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//


    @CacheLookup
    @FindBy(id = "response-0")
    WebElement workTypePlan;
    //Continue button 3
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnWorkTypePage;

    //======================== Methods ================================//

    //	Select have planning to work for 'Health and care professional'
    public void selectPlanToWorkForHCP(){
        clickOnElement(workTypePlan);
        log.info("click on : " + workTypePlan.toString());
    }
    //Click on Continue button 3
    public void mouseHoverAndClickOnContinueBtnOnWorkTypePage() {
        clickOnElement(continueBtnOnWorkTypePage);
        log.info("click on : " + continueBtnOnWorkTypePage.toString());
    }
}
