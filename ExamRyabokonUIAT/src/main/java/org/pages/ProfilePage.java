package org.pages;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage {
    Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//div[@class='account-aside']//a[@href='/account/logout']")
    private WebElement buttonSignOut;

    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProfilePage checkIsRedirectToProfilePage() {
        return this;
    }

    public void checkButtonSignOutVisible() {
        checkIsElementVisible(buttonSignOut);
    }
}
