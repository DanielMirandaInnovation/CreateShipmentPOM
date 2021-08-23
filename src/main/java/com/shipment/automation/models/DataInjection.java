package com.shipment.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String name, contactName, address, zipCodeMiami, email, phoneNumber,zipCodeAlabama, weight
            , descriptionProduct, extensionNumber, cityOrigen,cityDestination;

    public String getZipCodeMiami() {
        return zipCodeMiami;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public String getZipCodeAlabama() {
        return zipCodeAlabama;
    }

    public String getExtensionNumber() {
        return extensionNumber;
    }

    public String getWeight() {
        return weight;
    }

    public String getCityOrigen() {
        return cityOrigen;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public DataInjection(){
        this.name = faker.name().firstName() + " " + faker.name().lastName();
        this.contactName = faker.name().username();
        this.address = faker.address().secondaryAddress();
        this.email = faker.internet().emailAddress();
        this.phoneNumber = faker.phoneNumber().cellPhone();
        this.zipCodeMiami = faker.expression("33101");
        this.zipCodeAlabama = faker.expression("35242");
        this.weight = faker.expression("50");
        this.descriptionProduct = faker.commerce().productName();
        this.extensionNumber = faker.expression("27");
        this.cityOrigen = faker.expression("MIAMI");
        this.cityDestination = faker.expression("BIRMINGHAM");
    }

    public String getName() {
        return name;
    }

    public String getContactName() {
        return contactName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
