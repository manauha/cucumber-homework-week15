package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    /**
     * nationalityDropDownList, nextStepButton locators and create methods
     * 'void selectNationality(String nationality)' and 'void clickNextStepButton()'
     */
    //========================== Locators ============================//

    //Nationality Drop Down List
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    //Continue Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnSelectNationalityPage;
    //select[@id='response']


    //======================== Methods ================================//

    //	Select a Nationality 'Australia'
    public void selectANationalityFromDropDownList(String value) {
        selectByContainsTextFromDropDown(nationalityDropDownList, value);
        log.info("select value from dropdown : " + nationalityDropDownList.toString());
    }
    //	Click on Continue button
    public void mouseHoverAndClickOnContinueBtnOnSelectNationalityPage(){
        mouseHoverToElementAndClick(continueBtnOnSelectNationalityPage);
        log.info("mouse hover and click on : " + continueBtnOnSelectNationalityPage.toString());
    }
}
