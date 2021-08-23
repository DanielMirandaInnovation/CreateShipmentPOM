package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.ups.com/ship/guided/destination?tx=2168093475395478&loc=en_US")
public class HomePage extends PageObject {

    public By countryOrTerritoryOrigenSelect = By.id("origin-cac_country");
    public By nameOrigenInput = By.id("origin-cac_companyOrName");
    public By contactNameOrigenInput = By.id("origin-cac_contactName");
    public By addressOrigenInput = By.id("origin-cac_singleLineAddress");
    public By addressOrigenInput1 = By.id("origin-cac_addressLine1");
    public By editAddressButton = By.id("origin-singleLineAddressEditButton");
    public By zipCodeOriginInput = By.id("origin-cac_postalCode");
    public By cityOrigenInput = By.id("origin-cac_city");
    public By stateOrigenSelect = By.id("origin-cac_state");
    public By floridaOptionList = By.xpath("//option[@value='FL']");
    public By alabamaOptionList = By.xpath("//option[@value='AL']");
    public By emailOrigenInput = By.id("origin-cac_email");
    public By phoneNumberOrigenInput = By.id("origin-cac_phone");
    public By extensionPhoneOrigenInput = By.id("origin-cac_extension");
    public By continueOrigenButton = By.id("nbsBackForwardNavigationContinueButton");
    public By nameDestinationInput = By.id("destination-cac_companyOrName");
    public By contactNameDestinationInput = By.id("destination-cac_contactName");
    public By editAddressDestinationButton = By.id("destination-singleLineAddressEditButton");
    public By addressDestinationInput1 = By.id("destination-cac_addressLine1");
    public By zipCodeDestinationInput = By.id("destination-cac_postalCode");
    public By cityDestinationInput = By.id("destination-cac_city");
    public By stateDestinationSelect = By.id("destination-cac_state");
    public By emailDestinationInput = By.id("destination-cac_email");
    public By phoneNumberDestinationInput = By.id("destination-cac_phone");
    public By continueResidentialAddressButton = By.id("nbsAddressClassificationContinue");
    public By weightInput = By.id("nbsPackagePackageWeightField0");
    public By fastestOptionInput = By.id("nbsServiceTileServiceRadio0_0_0");
    public By descriptionProductInput = By.id("nbsShipmentDescription");
    public By paypalOption = By.xpath("//*[@id='tile-5']//label");
    public By reviewButton = By.id("nbsBackForwardNavigationReviewPrimaryButton");
    public By termsAndConditionsCheckbox = By.id("termsAndConditionsCheckbox");
    public By payAndGetLabels = By.id("nbsBackForwardNavigationPayAndGetLabelsButton");
    public By scroll = By.xpath("//*[text()='Indicates required field']");
    public By paypalValidation = By.id("headerText");
    public By shipFromValidation = By.id("originDrawerCircleIndicator");
    public By shipToValidation = By.id("destinationDrawerCircleIndicator");
    public By packageInformationValidation = By.id("packageDrawerCircleIndicator");
    public By shippingServiceValidation = By.id("serviceDrawerCircleIndicator");
    public By additionalOptionValidation = By.id("additionalOptionsDrawerCircleIndicator");
    public By paymentValidation = By.id("paymentDrawerCircleIndicator");


}
