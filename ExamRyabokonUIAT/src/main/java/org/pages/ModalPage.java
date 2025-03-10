package org.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalPage extends ParentPage {
    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//div[@class='modal-content sus-modal-content']")
    private WebElement modalWindow;

    @FindBy(xpath = "//button[@class='close sus-close']")
    private WebElement buttonCloseModalWindow;

    @FindBy(xpath = "//*[@id='countrySelect']")
    private WebElement ddCountry;

    @FindBy(xpath = "//select[@id='languageSelect']")
    private WebElement ddLanguage;

    @FindBy(xpath = "//button[@onclick='saveUserOptions()']")
    private WebElement buttonEnterSite;

    public ModalPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openModalWindow() {
        webDriver.get(baseURL);
        logger.info("Modal window was opened." + baseURL);

    }

    public void clickOnButtonCloseModalWindow() {
        buttonCloseModalWindow.click();
        logger.info("Modal window was closed.");
    }

    public void checkIsModalWindowDisplayed() {
        Assert.assertFalse("Modal window is not displayed", isModalWindowDisplayed());
    }

    public boolean isModalWindowDisplayed() {
        try {
            boolean state = modalWindow.isDisplayed();
            logger.info("Modal window is displayed.");
            return state;
        } catch (Exception e) {
            logger.info("Modal window is not displayed.");
            return false;
        }
    }

    public void clickOnDDCountry() {
        ddCountry.click();
        logger.info("Country dropdown was clicked.");
    }

    public void selectCountry(String France) {
        selectTextInDD(ddCountry, France);
        logger.info(France + " was selected in country dropdown.");

    }

    public void clickOnDDLanguage() {
        ddLanguage.click();
        logger.info("Language dropdown was clicked.");
    }

    public void selectLanguage(String français) {
        selectTextInDD(ddLanguage, français);
        logger.info(français + " was selected in language dropdown.");
    }

    public void clickOnButtonEnterSite() {
        buttonEnterSite.click();
        logger.info("Button Enter Site was clicked.");

    }
}
