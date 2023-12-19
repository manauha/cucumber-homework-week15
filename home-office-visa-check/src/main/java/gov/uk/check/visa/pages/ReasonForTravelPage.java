package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    /**
     * nextStepButton, reasonForVisitList locators and create methods
     * 'void selectReasonForVisit(String reason)' and 'void clickNextStepButton()'
     */

    //========================== Locators ============================//

    //Tourism Radio Btn
    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement tourismRadioBtn;

    //Work Radio Btn
    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement workRadioBtn;

    //Continue button 1
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtn1;

    //Family And Partner Radio Button
    @CacheLookup
    @FindBy(css = "#response-4")
    WebElement familyAndPartnerRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Join partner or family for a long stay']")
    WebElement joinPartner;

    //label[normalize-space()='Join partner or family for a long stay']

    //======================== Methods ================================//

    //	Select reason 'Tourism'
    public void selectRadioBtnForReasonTourism(String value) {
        mouseHoverToElementAndClick(tourismRadioBtn);
        log.info("mouse hover and click on : " + tourismRadioBtn.toString());
    }
    //	Select reason 'Work'
    public void selectRadioBtnForReasonWork(String value) {
        mouseHoverToElementAndClick(workRadioBtn);
        log.info("mouse hover and click on : " + workRadioBtn.toString());
    }

    public void selectRadioButtonForReasonWork() {
        clickOnElement(workRadioBtn);
        log.info("click on : " + workRadioBtn.toString());
    }

    //	Click on Continue button 1
    public void mouseHoverAndClickOnContinueOfReasonForTravelPage() {
        mouseHoverToElementAndClick(continueBtn1);
        log.info("mouse hover and click on : " + continueBtn1.toString());
    }

    //	Select reason 'Join partner or family for a long stay'
    public void selectRadioBtnForJoinPartnerOrFamilyForALongStay(String value){
        mouseHoverToElementAndClick(familyAndPartnerRadioBtn);
        log.info("mouse hover and click on : " + familyAndPartnerRadioBtn.toString());
    }

    public void selectJoinPartnerAndFamily(){
        clickOnElement(joinPartner);
        log.info("click on : " + joinPartner.toString());
    }


}
