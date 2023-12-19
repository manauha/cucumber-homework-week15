package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputersSteps {
    @When("I click on Computers tab")
    public void iClickOnComputersTab() {
        new HomePage().clickOnComputers();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String computers) {
        Assert.assertEquals(new ComputerPage().verifyComputerText(),computers,"Error");
    }

    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktops();
    }

    @Then("I should see desktops {string} text")
    public void iShouldSeeDesktopsText(String desktops) {
        Assert.assertEquals(new DesktopPage().verifyDesktopsText(),desktops,"Error");
    }

    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartLink();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getMessageText(),message,"Error");
    }
}
