package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.openqa.selenium.By;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {

    private static final By loginSecurePageHeader = By.xpath("//h2[text()=' Secure Area']");
    private static final By logoutButton=By.xpath("//a[@href='/logout']");
    private static final By alertMessage=By.xpath("//div[@id='flash']");

    public static boolean isLoginSecurePageDisplayed() {
        return getDriver().findElement(loginSecurePageHeader).isDisplayed();
    }

    public static boolean isLoginAlertDisplayed() {
        return getDriver().findElement(alertMessage).isDisplayed();
    }

    public static String getLoginAlertMessage() {
        return getDriver().findElement(alertMessage).getText();
    }

    public static void onClickLogoutButton(){
        getDriver().findElement(logoutButton).click();
    }
}
