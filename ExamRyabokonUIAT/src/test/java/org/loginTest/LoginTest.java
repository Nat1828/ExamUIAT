package org.loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.BaseTest.BaseTest;
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

public class LoginTest extends BaseTest {

    @Test
    public void T004_validLogin() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnButtonCloseModalWindow();
        pageProvider.getModalPage().checkIsModalWindowDisplayed();
        pageProvider.getHomePage().clickOnUserAvatarButton();
        pageProvider.getHomePage().clickOnButtonSignInDD();
        pageProvider.getLoginPage().enterTextIntoInputLogin("natalkar2000@yahoo.com");
        pageProvider.getLoginPage().enterTextIntoInputPassword("nata2000");
        pageProvider.getLoginPage().clickOnButtonLogIn();
        pageProvider.getProfilePage().checkIsRedirectToProfilePage();
        pageProvider.getProfilePage().checkButtonSignOutVisible();

    }

    @Test
    public void T005_invalidLogin() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnButtonCloseModalWindow();
        pageProvider.getModalPage().checkIsModalWindowDisplayed();
        pageProvider.getHomePage().clickOnUserAvatarButton();
        pageProvider.getHomePage().clickOnButtonSignInDD();
        pageProvider.getLoginPage().enterTextIntoInputLogin("2000@yahoo.com");
        pageProvider.getLoginPage().enterTextIntoInputPassword("nata2000");
        pageProvider.getLoginPage().clickOnButtonLogIn();
        pageProvider.getLoginPage().checkAlarmMessageisDisplayed();

    }
}