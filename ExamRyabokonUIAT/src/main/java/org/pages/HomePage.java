package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage {
    Logger logger = Logger.getLogger(getClass());

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
}
