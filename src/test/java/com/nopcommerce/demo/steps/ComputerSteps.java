package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("User is on Home Page")
    public void userIsOnHomePage() {

    }

    @When("User Click on computer tab")
    public void userClickOnComputerTab(String tab) {
        new ComputerPage().clickOnSubMenu(tab);
    }

    @Then("User verify the text {string}")
    public void userVerifyTheText(String arg0) {
        Assert.assertEquals(new ComputerPage().getPageTitleText(), "Computers" ,"Message displayed" );
    }

    @Given("User is on the  Home Page")
    public void userIsOnTheHomePage() {
    }

    @And("User click on Desktops link")
    public void userClickOnDesktopsLink() {

    }

    @Then("User verify {string} text")
    public void userVerifyText(String arg0) {
        Assert.assertEquals(new DesktopsPage().getPageTitleText(),"Desktops", "Text displayed");
    }

    @And("User Click on product name {string}")
    public void userClickOnProductName(String arg0) {
        new RegisterPage().clickOnContinueButton();
    }

    @And("User Select processor {string}")
    public void userSelectProcessorProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("User Select RAM {string}")
    public void userSelectRAMRam(String ramGB) {
        new BuildYourOwnComputerPage().selectRam(ramGB);
    }

    @And("User Select HDD {string}")
    public void userSelectHDDHdd(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("User Select OS {string}")
    public void userSelectOSOs(String osName) {
        new BuildYourOwnComputerPage().selectOS(osName);
    }

    @And("User Select Software {string}")
    public void userSelectSoftwareSoftware(String softwareName ) {
        new BuildYourOwnComputerPage().selectSoftware(softwareName);
    }

    @And("User Click on {string} Button")
    public void userClickOnButton(String arg0) {
        new RegisterPage().clickOnContinueButton();
    }

    @Then("User Verify message {string}")
    public void userVerifyMessage(String arg0) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductNameText(), "Build your own computer", "Text displayed");
}


}
