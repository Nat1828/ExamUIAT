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

import static org.data.TestData.*;

public class LoginTest extends BaseTest {

    @Test
    public void T004_validLogin() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnButtonCloseModalWindow();
        pageProvider.getModalPage().checkIsModalWindowDisplayed();
        pageProvider.getHomePage().clickOnUserAvatarButton();
        pageProvider.getHomePage().clickOnButtonSignInDD();
        pageProvider.getLoginPage().checkIsRedirectToLoginPage();
        pageProvider.getLoginPage().enterTextIntoInputLogin(VALID_LOGIN);
        pageProvider.getLoginPage().enterTextIntoInputPassword(VALID_PASSWORD);
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
        pageProvider.getLoginPage().checkIsRedirectToLoginPage();
        pageProvider.getLoginPage().enterTextIntoInputLogin(INVALID_LOGIN);
        pageProvider.getLoginPage().enterTextIntoInputPassword(VALID_PASSWORD);
        pageProvider.getLoginPage().clickOnButtonLogIn();
        pageProvider.getLoginPage().checkAlarmMessageisDisplayed();

    }

    @Test
    public void T006_invalidPassword() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnButtonCloseModalWindow();
        pageProvider.getModalPage().checkIsModalWindowDisplayed();
        pageProvider.getHomePage().clickOnUserAvatarButton();
        pageProvider.getHomePage().clickOnButtonSignInDD();
        pageProvider.getLoginPage().checkIsRedirectToLoginPage();
        pageProvider.getLoginPage().enterTextIntoInputLogin(VALID_LOGIN);
        pageProvider.getLoginPage().enterTextIntoInputPassword(INVALID_PASSWORD);
        pageProvider.getLoginPage().clickOnButtonLogIn();
        pageProvider.getLoginPage().checkAlarmMessageisDisplayed();

    }
}