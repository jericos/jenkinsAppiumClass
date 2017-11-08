package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class SideBarNavigation extends ParentPage{
    public SideBarNavigation(AppiumDriver driver) {
        super(driver);
    }

    By LOGOUT_OPTION = By.
            id("com.belatrixsf.connect:id/bottom_navigation_container");

    /**
     * This a method let me logout of my current session
     **/
    public void logOutUserSession()
    {
        handlingWaitToElement(LOGOUT_OPTION);
        click(LOGOUT_OPTION);
    }




}
