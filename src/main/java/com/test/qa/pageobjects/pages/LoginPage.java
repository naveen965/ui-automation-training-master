package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.openqa.selenium.By;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {

    private static final By loginPageHeader = By.xpath("//h2[text()='Login Page']");
    private static final By userName = By.id("username");
    private static final By userPassword = By.id("password");
    private static final By submitButton = By.xpath("//button[@type='submit']");
    private static final By alertMessage=By.xpath("//div[@id='flash']");

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(loginPageHeader).isDisplayed();
    }

    public static  void  setUserName(String username){
        getDriver().findElement(userName).sendKeys(username);
    }

    public static  void  setUserPassword(String password){
        getDriver().findElement(userPassword).sendKeys(password);
    }

    public static void onClickSubmitButton(){
        getDriver().findElement(submitButton).click();
    }

    public static boolean isLoginAlertDisplayed() {
        return getDriver().findElement(alertMessage).isDisplayed();
    }

    public static String getLoginAlertMessage() {
        return getDriver().findElement(alertMessage).getText();
    }
}
