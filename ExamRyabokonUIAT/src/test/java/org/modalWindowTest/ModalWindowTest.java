package org.modalWindowTest;

import org.BaseTest.BaseTest;
import org.junit.Test;

public class ModalWindowTest extends BaseTest {

    @Test
    public void T001_closeModalWindowToAccessSite() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnButtonCloseModalWindow();
        pageProvider.getModalPage().checkIsModalWindowDisplayed();
    }

    @Test
    public void T002_selectCountryLanguageModalWindowToAccessSite() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnDDCountry();
        pageProvider.getModalPage().selectCountry("France");
        pageProvider.getModalPage().clickOnDDLanguage();
        pageProvider.getModalPage().selectLanguage("Français");
        pageProvider.getModalPage().clickOnButtonEnterSite();
        pageProvider.getHomePage().checkIsRedirectToHomePage();
        pageProvider.getHomePage().checkIsCountryHeaderFranceDisplayed();
        pageProvider.getHomePage().checkIsLanguageHeaderFrenchDisplayed();

    }

    @Test
    public void T003_selectCountryNotLocalLanguageModalWindowToAccessSite() {
        pageProvider.getModalPage().openModalWindow();
        pageProvider.getModalPage().clickOnDDCountry();
        pageProvider.getModalPage().selectCountry("Ukraine");
        pageProvider.getModalPage().clickOnDDLanguage();
        pageProvider.getModalPage().selectLanguage("English");
        pageProvider.getModalPage().clickOnButtonEnterSite();
        pageProvider.getHomePage().checkIsRedirectToHomePage();
        pageProvider.getHomePage().checkIsCountryHeaderUkraineDisplayed();
        pageProvider.getHomePage().checkIsLanguageHeaderEnglishDisplayed();

    }
}
