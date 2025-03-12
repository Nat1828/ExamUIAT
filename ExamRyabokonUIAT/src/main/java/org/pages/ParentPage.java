package org.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

abstract public class ParentPage extends CommonActionsWithElements {

    String baseURL = "https://isqi.org";

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    abstract protected String getRelativeUrl();

    protected void checkURL() {
        Assert.assertEquals("URL is not expected"
                , baseURL + getRelativeUrl()
                , webDriver.getCurrentUrl());
    }

}
