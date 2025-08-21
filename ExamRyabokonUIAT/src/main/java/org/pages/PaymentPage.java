package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends ParentPage {
   Logger logger = Logger.getLogger(getClass());

  @FindBy(xpath = "//p[@class='product-detail-price test']")
    private WebElement productPriceFrance285;

    public PaymentPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/fr/ISTQB-Certified-Tester-Foundation-Level-4.0-CTFL/CT-FL-4.2237";
    }

    public PaymentPage checkIsRedirectToPaymentPage() {
        checkURL();
        logger.info("Successfully redirected to French Payment Page.");
        return this;
    }

    public void checkProductPriceFrance285Visible() {
        checkIsElementVisible(productPriceFrance285);
        logger.info("Product price France 285 is visible.");
    }
    public void checkProductPriceFrance285Text(String expectedText) {
        checkTextInElement(productPriceFrance285, expectedText);
        logger.info("Product price France 285 text is: " + expectedText);
    }
}