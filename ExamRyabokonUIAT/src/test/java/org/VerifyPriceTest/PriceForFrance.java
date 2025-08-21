package org.VerifyPriceTest;

import org.BaseTest.BaseTest;
import org.junit.Test;

public class PriceForFrance  extends BaseTest {

    @Test

    public void T008_verifyPriceForFrance() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnDDCountry();
        pageProvider.getModalPage().selectCountry("France");
        pageProvider.getModalPage().clickOnDDLanguage();
        pageProvider.getModalPage().selectLanguage("Français");
        pageProvider.getModalPage().clickOnButtonEnterSite();
        pageProvider.getHomePage().checkIsRedirectToHomePage();
        pageProvider.getHomePage().checkIsCountryHeaderFranceDisplayed();
        pageProvider.getHomePage().checkIsLanguageHeaderFrenchDisplayed();
        pageProvider.getHomePage().checkifDisplayedBlockISTQB();
        pageProvider.getHomePage().clickOnButtonISTQB();
        pageProvider.getPaymentPage().checkIsRedirectToPaymentPage();
        pageProvider.getPaymentPage().checkProductPriceFrance285Visible();
        pageProvider.getPaymentPage().checkProductPriceFrance285Text("240,00 €");

    }
}
