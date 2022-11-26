package com.rizkimaulanaazis.selenium;

import com.rizkimaulanaazis.selenium.drivers.DriverSingleton;
import com.rizkimaulanaazis.selenium.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
