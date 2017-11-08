package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class AlertMessageTwoOptions extends ParentPage {
    public AlertMessageTwoOptions(AppiumDriver driver) {
        super(driver);
    }

    By CONTEINER_MESSAGE = By.
            id("android:id/content");
    By MESSAGE = By.
            id("android:id/alertTitle");
    By YES_OPTION = By.
            id("android:id/button1");
    By NO_OPTION = By.
            id("android:id/button2");

    /**
     * This a method is for wait load the message alert
     **/
    public void waitForAlertMessage()
    {
        handlingWaitToElement(CONTEINER_MESSAGE);
        handlingWaitToElement(MESSAGE);
    }

    /**
     * This a method is for do click in Yes option
     **/
    public void answerYes()
    {
        click(YES_OPTION);
    }

}
