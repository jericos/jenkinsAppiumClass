package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainProfilePage extends ParentPage {
    public MainProfilePage(AppiumDriver driver){
        super(driver);
    }

    By LBL_NAME = By.
            id("com.belatrixsf.connect:id/profile_name");
    By LBL_EMAIL = By.
            id("com.belatrixsf.connect:id/profile_email");
    By LBL_IDSKYPE = By.
            id("com.belatrixsf.connect:id/skype_id");
    By LBL_LOCATION = By.
            id("com.belatrixsf.connect:id/location_name");
    By BTN_EDIT = By.
            id("com.belatrixsf.connect:id/action_edit_profile");
    By BTN_SIDEBAR = By.
            xpath("//android.widget.ImageButton[@content-desc=\"Open\"]");
    By TAB_CONTACTS = By.
            xpath("//android.widget.TextView[@text='CONTACTS']");
    By TAB_PROFILE = By.
            xpath("//android.widget.TextView[@text='PROFILE']");


    public String getName()
    {
        handlingWaitToElement(LBL_NAME);
        return getElementValue(LBL_NAME);
    }

    public String getEmail()
    {
        handlingWaitToElement(LBL_EMAIL);
        return getElementValue(LBL_EMAIL);
    }

    public String getSkypeId()
    {
        handlingWaitToElement(LBL_IDSKYPE);
        return getElementValue(LBL_IDSKYPE);
    }

    public String getLocation()
    {
        handlingWaitToElement(LBL_LOCATION);
        return getElementValue(LBL_LOCATION);
    }

    /**
     * This a method is for wait to load the Main Profile Page
     **/
    public void loadPageSucessfully()
    {
        handlingWaitToElement(LBL_NAME);
        handlingWaitToElement(BTN_EDIT);
    }

    /**
     * This a method is for wait the sideBar Option
     **/
    public void openMenuSideBar()
    {
        handlingWaitToElement(BTN_SIDEBAR);
        click(BTN_SIDEBAR);
    }

    public void clickContactTab(){
        handlingWaitToElement(TAB_CONTACTS);
        click(TAB_CONTACTS);
    }

    public void clickProfileTab(){
        handlingWaitToElement(TAB_PROFILE);
        click(TAB_PROFILE);
    }
}
