package com.rizkimaulanaazis.selenium.pages;

import com.rizkimaulanaazis.selenium.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JumlahProduk {

    private WebDriver driver;

    public JumlahProduk() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
    WebElement menuPencarian;

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
    WebElement txtProduk;

    public void menuPencarian() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", menuPencarian);
        menuPencarian.sendKeys("Jam Tangan");
        menuPencarian.sendKeys(Keys.ENTER);
    }

    public String txtProduk() {
        return txtProduk.getText();
    }
}
