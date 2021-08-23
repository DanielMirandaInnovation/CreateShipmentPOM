package com.shipment.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SpecialMethods {

    public static JavascriptExecutor executor;

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickJS(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }

    public static void scroll(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{driver.findElement(by)});
    }

    public static void write(WebDriver driver, By by, String string){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(by).sendKeys(string);
    }
}
