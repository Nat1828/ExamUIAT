package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//input[@id='loginMail']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@id='loginPassword']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit' and contains (text(),'Log in')]")
    private WebElement buttonLogIn;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-has-icon']")
    private WebElement alarmMessage;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage checkIsRedirectToLoginPage() {
        //check current URL
        return this;
    }

    public void enterTextIntoInputLogin(String mail) {
        enterTextIntoInputLogin(inputLogin, mail);
        ;
    }

    public void enterTextIntoInputPassword(String password) {
        enterTextIntoInputPassword(inputPassword, password);

    }

    public void clickOnButtonLogIn() {
        clickOnElement(buttonLogIn);
    }

    public void checkAlarmMessageisDisplayed() {
        checkIsElementVisible(alarmMessage);
    }
}
