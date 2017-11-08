package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import junit.framework.Assert;
import org.openqa.selenium.By;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class ContactProfilePage extends ParentPage{

    public ContactProfilePage(AppiumDriver driver) {
        super(driver);
    }

    By CONTAINER_PAGE = By.
            id("com.belatrixsf.connect:id/account_swipe_refresh");
    By BTN_BACK_PAGE = By.
            xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");
    By BTN_KUDOS = By.
            id("com.belatrixsf.connect:id/action_recommend");
    By PROFILE_NAME = By.
            id("com.belatrixsf.connect:id/profile_name");
    By PROFILE_EMAIL = By.
            id("com.belatrixsf.connect:id/profile_email");
    By PROFILE_SKYPE_ID = By.
            id("com.belatrixsf.connect:id/skype_id");
    By PROFILE_LOCATION = By.
            id("com.belatrixsf.connect:id/location_name");

    /**
     * This a method is for do click to open the Back Page Button
     **/
    public void clickBackPage()
    {
        click(BTN_BACK_PAGE);
    }

    /**
     * This a method is for wait to load the Contact Profile Page
     **/
    public void loadPageSucessfully()
    {
        handlingWaitToElement(CONTAINER_PAGE);
        handlingWaitToElement(PROFILE_NAME);
        handlingWaitToElement(BTN_BACK_PAGE);
    }

    /**
     * This a method is for do click on recommend
     **/
    public void clickRecommend()
    {
        click(BTN_KUDOS);
    }

    /**
     * This a method is for check the user profile page is correct
     * @param contactName
     **/
    public void checkUserNameOfContactPage(String contactName)
    {
        loadPageSucessfully();
        Assert.assertEquals("The user profile page doesnt correct",
                contactName, getElementValue(PROFILE_NAME));
    }

    public void clickKudosButtom(){
        handlingWaitToElement(BTN_KUDOS);
        click(BTN_KUDOS);
    }


}
