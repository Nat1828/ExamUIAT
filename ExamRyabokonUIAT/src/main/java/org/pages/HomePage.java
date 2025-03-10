package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//*[@id='countrySelectTopBar']/option[69]")
    private WebElement headerCountryFrance;

    @FindBy(xpath = "//*[@id='languagesDropdown-top-bar']/div")
    private WebElement headerLanguageFrench;

    @FindBy(xpath = "//*[@id='countrySelectTopBar']/option[234]")
    private WebElement headerCountryUkraine;

    @FindBy(xpath = "//div[@class='top-bar-list-icon language-flag country-gb language-en']")
    private WebElement headerLanguageEnglish;

    @FindBy(xpath = "//span[@class='icon icon-avatar']")
    private WebElement userAvatarButton;

    @FindBy(xpath = "//a[@href='/account/login' and @class='btn btn-primary account-menu-login-button']")
    private WebElement buttonSignInDD;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openHomePage() {
        String baseURL = "https://isqi.org";
        webDriver.get(baseURL);
        logger.info("Modal window was opened." + baseURL);

    }

    public HomePage checkIsRedirectToHomePage() {
        return this;
    }

    public void checkIsCountryHeaderFranceDisplayed() {
        headerCountryFrance.isDisplayed();
        logger.info("Country header France is displayed.");
    }

    public void checkIsLanguageHeaderFrenchDisplayed() {
        headerLanguageFrench.isDisplayed();
        logger.info("Language header French is displayed.");

    }

    public void checkIsCountryHeaderUkraineDisplayed() {
        headerCountryUkraine.isDisplayed();
        logger.info("Country header Ukraine is displayed.");
    }

    public void checkIsLanguageHeaderEnglishDisplayed() {
        headerLanguageEnglish.isDisplayed();
        logger.info("Language header English is displayed.");

    }

    public void clickOnUserAvatarButton() {
        userAvatarButton.click();
        logger.info("User avatar button was clicked.");
    }

    public void clickOnButtonSignInDD() {
        buttonSignInDD.click();
        logger.info("Sign In button was clicked.");
    }
}
