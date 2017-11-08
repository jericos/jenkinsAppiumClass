package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class LoginPage extends ParentPage {

    public LoginPage(AppiumDriver driver){
        super(driver);
    }

    By CONTAINER_PAGE = By.
            id("com.belatrixsf.connect:id/login");
    By TXT_USER_NAME = By.
            id("com.belatrixsf.connect:id/username");
    By TXT_PASSWORD = By.
            id("com.belatrixsf.connect:id/password");
    By BTN_LOGIN = By.
            id("com.belatrixsf.connect:id/log_in");
    By HLNK_FORGOT_PASSWORD = By.
            id("com.belatrixsf.connect:id/forgot_password");
    By HLNK_NEW_USER = By.
            id("com.belatrixsf.connect:id/sign_up");


    /**
     * Refreshing App Problemns With 7.1.1 Android Version at moment to start the APP
     */
    public void takingSessionActivity () {
        refreshWithSwipeTopBar();
    }


    /**
     * This method is used for Login on App
     * @param userName
     * @param password
     */
    public void loginOnApp (String userName, String password) {
        handlingWaitToElement(TXT_USER_NAME);
        hideTextSendKeys(TXT_USER_NAME,userName);
        sendKeys(TXT_PASSWORD, password);
        click(BTN_LOGIN);
    }

    public void clickSingIn (){
        click(BTN_LOGIN);
    }

    public void clickForgotPasswordOption(){
        click(HLNK_FORGOT_PASSWORD);
    }


}
