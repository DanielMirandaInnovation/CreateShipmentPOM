# CreateShipmentPOM

The project was realized with Page object Model, serenity, java y selenium.
-  the package page objects you will find the locators of the web page.
-  the package steps you will find the interactions, flows and methods that the robot used to interact with the page.
-  the package utils you will find the special methods of robot, this methods are important for the robot be smart.
-  the package model you will find the data that will be used in the execution. Every execution of the robot is with different data, because the robot use a faker data server.
-  the package runners you will can execute the automation flow.
-  the package stepdefinitions you will find the sequence of steps and actions to do.
- drivers are in main/resources/drivers/
- The features are in test/resources/features (user histories or use case)

## If you want to use chrome, leave the file of serenity.properties without changes.

## If you want to use mozilla firefox, copy and paste of the following in the serenity.properties

webdriver.driver=firefox

webdriver.gecko.driver=src/main/resources/drivers/geckodriver.exe

serenity.timeouts = 10000

## If you want to use internet explorer, copy and paste of the following in the serenity.properties

webdriver.driver=ie

webdriver.ie.driver=src/main/resources/drivers/IEDriverServer.exe

serenity.timeouts = 10000

- For run the project is only necessary to go the runner and execute from there.
- In the terms section, the robot validates that the previous steps have been completed correctly. 
- Finally, remember that the drivers must match with the version of the browsers, if any execution don't start make sure the drivers are the correspondings.

