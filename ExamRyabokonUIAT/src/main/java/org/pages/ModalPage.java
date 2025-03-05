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

    public ModalPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openModalWindow() {
        String baseURL = "https://isqi.org";
        webDriver.get(baseURL);
        logger.info("Modal window was opened." + baseURL);

    }


    public void clickOnButtonCloseModalWindow() {
        buttonCloseModalWindow.click();
    logger.info("Modal window was closed.");
    }

public void checkIsModalWindowDisplayed(){
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
}
