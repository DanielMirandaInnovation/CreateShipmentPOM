package com.shipment.tests.stepdefinitions;

import com.shipment.automation.steps.HomeSteps;
import com.shipment.automation.utils.SpecialMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CreateShipmentStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Given("^that a web user wants to create a shipment$")
    public void thatAWebUserWantsToCreateAShipment() {
        homeSteps.openBrowser();
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() {
        homeSteps.whereAreYouShippingFrom();
        homeSteps.whereIsYourShipmentGoing();
        homeSteps.whatKindOfPackagingAreYouUsing();
        homeSteps.howWouldYouLikeToShip();
        homeSteps.letsCheckFewMoreDetails();
        homeSteps.howWouldYouLikeToPay();
        homeSteps.reviewCreateShipment();
    }

    @Then("^he should see the created shipment\\.$")
    public void heShouldSeeTheCreatedShipment() {
        homeSteps.validations();
    }

}
