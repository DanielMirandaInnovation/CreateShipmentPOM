package com.shipment.automation.steps;

import com.shipment.automation.models.DataInjection;
import com.shipment.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.*;
import static com.shipment.automation.utils.SpecialMethods.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class HomeSteps {

    public HomePage homePage = new HomePage();
    DataInjection dataInjection = new DataInjection();
    DataInjection dataInjectionTwo = new DataInjection();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void whereAreYouShippingFrom(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        scroll(homePage.getDriver(), homePage.scroll);
        write(homePage.getDriver(),homePage.nameOrigenInput, dataInjection.getName());
        write(homePage.getDriver(),homePage.contactNameOrigenInput, dataInjection.getContactName());
        waitFor(1);
        clickJS(homePage.getDriver(), homePage.editAddressButton);
        write(homePage.getDriver(), homePage.addressOrigenInput1, dataInjection.getAddress());
        write(homePage.getDriver(), homePage.zipCodeOriginInput, dataInjection.getZipCodeMiami());
        write(homePage.getDriver(), homePage.cityOrigenInput, dataInjectionTwo.getCityOrigen());
        clickJS(homePage.getDriver(), homePage.stateOrigenSelect);
        waitFor(1);
        clickJS(homePage.getDriver(), homePage.floridaOptionList);
        write(homePage.getDriver(), homePage.emailOrigenInput, dataInjection.getEmail());
        waitFor(1);
        write(homePage.getDriver(), homePage.phoneNumberOrigenInput, dataInjection.getPhoneNumber());
        waitFor(1);
        write(homePage.getDriver(), homePage.extensionPhoneOrigenInput, dataInjection.getExtensionNumber());
        clickJS(homePage.getDriver(), homePage.continueOrigenButton);
    }

    @Step
    public void whereIsYourShipmentGoing(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        scroll(homePage.getDriver(), homePage.scroll);
        write(homePage.getDriver(),homePage.nameDestinationInput, dataInjectionTwo.getName());
        write(homePage.getDriver(),homePage.contactNameDestinationInput, dataInjectionTwo.getContactName());
        waitFor(1);
        clickJS(homePage.getDriver(), homePage.editAddressDestinationButton);
        write(homePage.getDriver(), homePage.addressDestinationInput1, dataInjectionTwo.getAddress());
        write(homePage.getDriver(), homePage.zipCodeDestinationInput, dataInjectionTwo.getZipCodeAlabama());
        write(homePage.getDriver(), homePage.cityDestinationInput, dataInjectionTwo.getCityDestination());
        clickJS(homePage.getDriver(), homePage.stateDestinationSelect);
        waitFor(1);
        clickJS(homePage.getDriver(), homePage.alabamaOptionList);
        write(homePage.getDriver(), homePage.emailDestinationInput, dataInjectionTwo.getEmail());
        write(homePage.getDriver(), homePage.phoneNumberDestinationInput, dataInjectionTwo.getPhoneNumber());
        waitFor(1);
        clickJS(homePage.getDriver(), homePage.continueOrigenButton);
        clickJS(homePage.getDriver(), homePage.continueResidentialAddressButton);
    }

    @Step
    public void whatKindOfPackagingAreYouUsing(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(1);
        write(homePage.getDriver(), homePage.weightInput, dataInjection.getWeight());
        clickJS(homePage.getDriver(), homePage.continueOrigenButton);
    }

    @Step
    public void howWouldYouLikeToShip(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(2);
        scroll(homePage.getDriver(), homePage.scroll);
        clickJS(homePage.getDriver(), homePage.fastestOptionInput);
        clickJS(homePage.getDriver(), homePage.continueOrigenButton);
    }

    @Step
    public void letsCheckFewMoreDetails(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(2);
        scroll(homePage.getDriver(), homePage.scroll);
        write(homePage.getDriver(), homePage.descriptionProductInput, dataInjection.getDescriptionProduct());
        clickJS(homePage.getDriver(), homePage.continueOrigenButton);
    }

    @Step
    public void howWouldYouLikeToPay(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(1);
        scroll(homePage.getDriver(), homePage.scroll);
        waitFor(1);
        clickJS(homePage.getDriver(), homePage.paypalOption);
        clickJS(homePage.getDriver(), homePage.reviewButton);
    }

    @Step
    public void reviewCreateShipment(){
        homePage.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(1);
        visibleComponentValidation(homePage.getDriver(), homePage.shipFromValidation);
        visibleComponentValidation(homePage.getDriver(), homePage.shipToValidation);
        visibleComponentValidation(homePage.getDriver(), homePage.packageInformationValidation);
        visibleComponentValidation(homePage.getDriver(), homePage.shippingServiceValidation);
        visibleComponentValidation(homePage.getDriver(), homePage.additionalOptionValidation);
        visibleComponentValidation(homePage.getDriver(), homePage.paymentValidation);
        scroll(homePage.getDriver(), homePage.termsAndConditionsCheckbox);
        clickJS(homePage.getDriver(), homePage.termsAndConditionsCheckbox);
        clickJS(homePage.getDriver(), homePage.payAndGetLabels);
    }

    @Step
    public void visibleComponentValidation(WebDriver driver, By by){
        assertTrue(driver.findElement(by).isEnabled());
    }

    @Step
    public void validations(){
        assertEquals(homePage.getDriver().findElement(homePage.paypalValidation).getText(),"Pay with PayPal");
    }
}
