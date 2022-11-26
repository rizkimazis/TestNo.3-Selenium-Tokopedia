package com.rizkimaulanaazis.selenium.pageobject;

import com.rizkimaulanaazis.selenium.drivers.DriverSingleton;
import com.rizkimaulanaazis.selenium.pages.JumlahProduk;
import com.rizkimaulanaazis.selenium.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJumlahProduk {

    public static WebDriver driver;
    private JumlahProduk jumlahproduk;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void page() {
        jumlahproduk = new JumlahProduk();
    }

    @AfterClass
    public void closeBrowser() {
        delay(5);
        DriverSingleton.closeObjectInstance();
    }

//    @Test
//    public void btnMasuk() {
//        //delay(Constants.DETIK);
//        jumlahproduk.btnMasuk();
//        System.out.println("Test Case btn masuk");
//    }
//
//    @Test
//    public void overlayMasuk() {
//        //delay(Constants.DETIK);
//        jumlahproduk.overlayMasuk();
//        System.out.println("Test Case overlay masuk");
//    }
//
//    @Test
//    public void noHpAtauEmail() {
//        //delay(Constants.DETIK);
//        jumlahproduk.noHpAtauEmail("rizkimaulanaazis@yahoo.co.id");
//        System.out.println("Test Case input No HP atau Email");
//    }
//
//    @Test
//    public void btnSelanjutnya() {
//        //delay(Constants.DETIK);
//        jumlahproduk.btnSelanjutnya();
//        System.out.println("Test Case btn Selanjutnya");
//    }
//
//    @Test
//    public void kataSandi() {
//        //delay(Constants.DETIK);
//        jumlahproduk.kataSandi("YoungRich1288");
//        System.out.println("Test Case input Kata Sandi");
//    }
//
//    @Test
//    public void btnLogin() {
//        //delay(Constants.DETIK);
//        jumlahproduk.btnLogin();
//        System.out.println("Test Case btn Login");
//    }
//
//    @Test
//    public void txtDashboardTokopedia() {
//        //delay(Constants.DETIK);
//        Assert.assertEquals(jumlahproduk.getTxtDashboardTokopedia(), "");
//        System.out.println("Test Case Dashboard Tokopedia");
//    }

    @Test
    public void menuPencarian() {
        delay(Constants.DETIK);
        jumlahproduk.menuPencarian();
        System.out.println("Test Case Menu Pencarian");
    }

    @Test
    public void getTxtProduk() {
        delay(Constants.DETIK);
        Assert.assertEquals(jumlahproduk.txtProduk(), "");
        delay(Constants.DETIK);
        System.out.println("Test Case Halaman Pencarian");
    }

    @Test
    public void scroll() {
        delay(Constants.DETIK);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,500)", "");
        js.executeScript("window.scrollBy(0,500)", "");
        System.out.println("Test Case Scroll Halaman Pencarian");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(3000 * detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

