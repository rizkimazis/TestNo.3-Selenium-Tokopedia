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

//    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[5]/button[1]")
//    WebElement btnMasuk;
//
//    @FindBy(xpath = "/html/body/div[5]/div[2]")
//    WebElement overlayMasuk;
//
//    @FindBy(xpath = "//*[@id=\"email-phone\"]")
//    WebElement noHpAtauEmail;
//
//    @FindBy(xpath = "//*[@id=\"email-phone-submit\"]")
//    WebElement btnSelanjutnya;
//
//    @FindBy(xpath = "//*[@id=\"password-input\"]")
//    WebElement kataSandi;
//
//    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/form/button/span/span")
//    WebElement btnLogin;
//
//    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/a")
//    WebElement txtDashboardTokopedia;

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
    WebElement menuPencarian;

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
    WebElement txtProduk;

//    public void btnMasuk(){
//        btnMasuk.click();
//    }
//
//    public void overlayMasuk(){
//        overlayMasuk.click();
//    }
//
//    public void noHpAtauEmail(String noHpAtauEmail){
//        this.noHpAtauEmail.click();
//        this.noHpAtauEmail.sendKeys(noHpAtauEmail);
//    }
//
//    public void btnSelanjutnya(){
//        btnSelanjutnya.click();
//    }
//
//    public void kataSandi(String ignoredKataSandi) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", kataSandi);
//        this.kataSandi.sendKeys("YoungRich1288");
//    }
//
//    public void btnLogin(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", btnLogin);
//    }
//
//    public String getTxtDashboardTokopedia(){
//        return txtDashboardTokopedia.getText();
//    }

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
