package com.belatrix.connect.page;
import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class EditProfilePage extends ParentPage {

    public EditProfilePage(AppiumDriver driver) {
        super(driver);
    }

    By CONTAINER_PAGE = By.
            id("com.belatrixsf.connect:id/main_content");
    By BTN_DONE = By.
            id("com.belatrixsf.connect:id/action_done");
    By BTN_SELECT_PICTURE = By.
            id("com.belatrixsf.connect:id/edit_image");
    By TXT_FIRST_NAME = By.
            id("com.belatrixsf.connect:id/firstName");
    By TXT_LAST_NAME = By.
            id("com.belatrixsf.connect:id/lastName");
    By TXT_SKYPE_ID = By.
            id("com.belatrixsf.connect:id/skypeId");
    By RBTN_BUENOS_AIRES = By.
            xpath("//android.widget.RadioButton[@text='Buenos Aires']");
    By RBTN_LIMA = By.
            xpath("//android.widget.RadioButton[@text='Lima']");
    By RBTN_MENDOZA = By.
            xpath("//android.widget.RadioButton[@text='Mendoza']");
    By RBTN_USA = By.
            xpath("//android.widget.RadioButton[@text='USA']");

    /**
     * This a method is for a edit the data basic profile
     * @param firstName
     * @param lastName
     * @param skypeId
     * @param location
     **/
    public void editDataProfile(String firstName, String lastName, String skypeId, String location)	{
        clearTextValue(TXT_FIRST_NAME);
        sendKeys(TXT_FIRST_NAME, firstName);
        clickAndroidBackButton();
        clearTextValue(TXT_LAST_NAME);
        sendKeys(TXT_LAST_NAME, lastName);
        clickAndroidBackButton();
        clearTextValue(TXT_SKYPE_ID);
        sendKeys(TXT_SKYPE_ID, skypeId);
        clickAndroidBackButton();

        String locationBuenosAirestxt = getElementValue(RBTN_BUENOS_AIRES);
        String locationLimatxt = getElementValue(RBTN_LIMA);
        String locationMendozatxt = getElementValue(RBTN_MENDOZA);
        String locationUSAtxt = getElementValue(RBTN_USA);

        if(locationBuenosAirestxt.equals(location))
            click(RBTN_BUENOS_AIRES);
        else if (locationLimatxt.equals(location))
            click(RBTN_LIMA);
        else if (locationMendozatxt.equals(location))
            click(RBTN_MENDOZA);
        else if (locationUSAtxt.equals(location))
            click(RBTN_USA);
    }

    /**
     * This a method is for a click a button Done to finish the edition
     **/
    public void finishTheEditionProfile()
    {
        click(BTN_DONE);
    }

    /**
     * This a method is for wait to load the page successfully
     **/
    public void loadPageSucessfully()
    {
        handlingWaitToElement(CONTAINER_PAGE);
    }
}
