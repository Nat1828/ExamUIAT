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
}