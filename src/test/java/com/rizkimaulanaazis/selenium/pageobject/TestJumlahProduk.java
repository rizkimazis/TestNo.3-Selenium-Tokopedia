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

