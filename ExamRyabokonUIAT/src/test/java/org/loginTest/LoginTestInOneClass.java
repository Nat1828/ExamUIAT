package org.loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTestInOneClass {
//    private WebDriver webDriver;
//    private Logger logger = Logger.getLogger(getClass());
//
//    @Before
//    public void setUp () {
//        WebDriverManager.chromedriver().setup();
//        webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        logger.info("Browser was opened");
//
//    }
//
//    @After
//    public void tearDown () {
//        webDriver.quit();
//        logger.info("Browser was closed");
//
//    }
//    @Test
//    public void closeModalWindowToAccessSite() {
//webDriver.get("https://isqi.org");
//logger.info("Site was opened");
//        WebElement closeModalWindow = webDriver.findElement(By.xpath("//button[@class='close sus-close']"));
//        closeModalWindow.click();
//        logger.info("Modal window is closed");
//        Assert.assertFalse("Modal Window is not displayed", isModalWindowDisplayed());
//    }
//
//    private boolean isModalWindowDisplayed() {
//        boolean state = webDriver.findElement(By.xpath("//button[@class='close sus-close']")).isDisplayed();
//        return state;
//    }
}