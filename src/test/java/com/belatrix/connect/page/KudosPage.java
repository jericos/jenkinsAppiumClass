package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import junit.framework.Assert;
import org.openqa.selenium.By;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class KudosPage extends ParentPage {

    public KudosPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * Elements From Principal KUDOS PAGE
     */
    By CONTAINER_PAGE = By.
            id("com.belatrixsf.connect:id/main_content");
    By BTN_BACK_PAGE = By.
            xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");
    By BTN_DONE = By.
            id("com.belatrixsf.connect:id/action_done");
    By TXT_USER_NAME = By.
            id("com.belatrixsf.connect:id/contact_full_name");
    By SELECT_ACTION = By.
            xpath("//android.widget.TextView[@text='Select an action']");
    By WRITE_COMMEND = By.
            xpath("//android.widget.TextView[@text='Write a comment']");
    By SELECT_TAG = By.
            xpath("//android.widget.TextView[@text='Select a Tag']");
    //ELEMENT FROM SUB PAGE Action
    By SELECT_LBL_ACTION = By.
            xpath("//android.widget.TextView");
    //ELEMENT FROM SUB PAGE Tag
    By SELECT_LBL_TAG = By.
            xpath("//android.widget.TextView[@index='0']");
    //ELEMENT FROM SUB PAGE comment
    By TXT_COMMENT = By.
            id("com.belatrixsf.connect:id/comment");
    //MESSAGE SNACK BAR MESSAGE



    /**
     * This a method is for wait for a Give Recommendation page load
     * when use a parameter contactName is because you already
     * selected an user before enter in this page
     * @param contactName
     **/
    public void loadPageSuccessfully(String contactName)
    {
        handlingWaitToElement(CONTAINER_PAGE);
        handlingWaitToElement(TXT_USER_NAME);
        Assert.assertEquals("The user give recommendation page doesnt correct",
                contactName, getElementValue(TXT_USER_NAME));
    }

    /**
     * This a method is for wait for a Give Recommendation page load
     * when not use a parameter is because we are enter in this page
     * without selected an user
     **/
    public void loadPageSuccessfully()
    {
        handlingWaitToElement(CONTAINER_PAGE);
        handlingWaitToElement(SELECT_ACTION);
        handlingWaitToElement(BTN_BACK_PAGE);
    }


    /**
     * This a method is for do click on select category option
     **/
    public void selectAnAction()
    {
        click(SELECT_ACTION);
    }

    /**
     * This a method is for check the subCateogry Selected by the user
     * @param subAction
     **/
    public void checkSubActionSelected(String subAction)
    {
        handlingWaitsToNewElementByText(SELECT_ACTION, subAction);
    }

    /**
     * This a method is for do click on write comment option
     **/
    public  void writeComment()
    {
        click(WRITE_COMMEND);
    }

    /**
     * This a method is for check the comment entered by the user
     * @param commnet
     **/
    public void checkTheCommentEntered(String commnet)
    {
        handlingWaitsToNewElementByText(WRITE_COMMEND, commnet);
    }

    /**
     * This a method is for do click on select tag option
     **/
    public void selectTag()
    {
        click(SELECT_TAG);
    }

    /**
     * This a method is for check the tag selected by the user
     * @param tag
     **/
    public void checkTheTagSelected(String tag)
    {
        handlingWaitsToNewElementByText(SELECT_TAG, tag);
    }

    /**
     * This a method is for do click on Done button
     **/
    public void doneKudo()
    {
        click(BTN_DONE);
    }


    //////METHOD FOR SELECT AN ACTION
    /**
     * This a method is for do click on an action desired
     * @param action
     **/
    public void selectAnAction(String action)
    {
        handlingWaitToElement(SELECT_LBL_ACTION);
        clickElementByTextValue(SELECT_LBL_ACTION, action);
    }

    //////METHOD FOR SELECT A TAG
    /**
     * This a method is for do click on a sub-category desired
     * @param tag
     **/
    public void selectTag(String tag)
    {
        handlingWaitToElement(SELECT_LBL_TAG);
        clickElementByTextValue(SELECT_LBL_TAG, tag);
    }

    //////METHOD FOR WRITE A COMMENT
    /**
     * This a method is for send a comment in this page
     * @param comment
     **/
    public void writeComment(String comment)
    {
        sendKeys(TXT_COMMENT, comment);
    }

    /**
     * This a method is for do click in done button after wrote a text
     **/
    public void doneWriteComment()
    {
        click(BTN_DONE);
    }


}
