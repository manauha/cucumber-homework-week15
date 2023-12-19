package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSteps {

    @Given("User is on homepage")
    public void userIsOnHomepage() {
    }

    @And("User accept the cookies")
    public void userAcceptTheCookies() {
        new StartPage().mouseHoverAndClickOnAcceptCookiesBtn();
    }

    @When("User click on Start now button")
    public void userClickOnStartNowButton() {
        new StartPage().mouseHoverAndClickOnStartBtn();
    }

    @And("User select a Nationality as {string}")
    public void userSelectANationalityAs(String nationality) {
        new SelectNationalityPage().selectANationalityFromDropDownList(nationality);
    }

    @And("User click on Continue button")
    public void userClickOnContinueButton() {
        new SelectNationalityPage().mouseHoverAndClickOnContinueBtnOnSelectNationalityPage();
    }

    @And("User select reason {string}")
    public void userSelectReasonTourism(String tourism) {
        new ReasonForTravelPage().selectRadioBtnForReasonTourism(tourism);
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        new ReasonForTravelPage().mouseHoverAndClickOnContinueOfReasonForTravelPage();
    }

    @Then("User should see result {string}")
    public void userShouldSeeResult(String expected) {
        Assert.assertEquals(new ResultPage().verifyResultMessageForAustralia(), expected, "Error Message");
    }

    @And("User select a reason {string}")
    public void userSelectAReason(String work) {
        new ReasonForTravelPage().selectRadioBtnForReasonWork(work);
    }

    @And("User select a reason Work, academic visit or business")
    public void userSelectAReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectRadioButtonForReasonWork();
    }

    @When("User select intent to stay for longer than six months")
    public void user_select_intent_to_stay_for_longer_than_six_months() {
        new DurationOfStayPage().clickOnLongerThan6Months();
    }

    @And("User press on Continue button")
    public void userPressOnContinueButton() {
        new DurationOfStayPage().clickNextStepButton();
    }

    @And("Select have planning to work for Health and care professional")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectPlanToWorkForHCP();
    }

    @And("User hit on Continue button")
    public void userHitOnContinueButton() {
        new WorkTypePage().mouseHoverAndClickOnContinueBtnOnWorkTypePage();
    }

    @Then("User see result {string}")
    public void userSeeResult(String result) {
        Assert.assertEquals(new ResultPage().verifyResultMessageForHCP(), result, "Error");
    }

    @And("User select  reason {string}")
    public void userSelectReason(String longStay) {
        new ReasonForTravelPage().selectRadioBtnForJoinPartnerOrFamilyForALongStay(longStay);
    }

    @And("User select  reason join partner or family for a long stay")
    public void userSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectJoinPartnerAndFamily();
    }

    @Then("User should see message {string}")
    public void userShouldSeeMessage(String expected) {
        Assert.assertEquals(new ResultPage().getYouMayNeedAVisaText(),expected,"Error");
    }

}
