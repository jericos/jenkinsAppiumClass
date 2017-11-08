package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class ContactsPage extends ParentPage{

    public ContactsPage(AppiumDriver driver) {
        super(driver);
    }


    By CONTAINER_PAGE = By.
            id("com.belatrixsf.connect:id/employees");
    By TXT_FIND_CONTACT = By.
            id("com.belatrixsf.connect:id/action_search");
    By SELECT_A_CONTACT = By.
            xpath("//android.support.v7.widget.RecyclerView[@index='0']"
                    + "/android.widget.LinearLayout[@index='0']");
    By CONTACT_FOUND = By.
            id("com.belatrixsf.connect:id/contact_holder");
    By TXT_SEARCH_CONTACT = By.
            id("android:id/content");
    By BTN_CLOSE_SEARCH = By.
            xpath("//android.widget.TextView[@text='PROFILE']");

    /**
     * This a method is for wait to load the Contact Profile Page
     **/
    public void loadPageSucessfully()
    {
        handlingWaitToElement(CONTAINER_PAGE);
        handlingWaitToElement(TXT_FIND_CONTACT);
    }

    /**
     * This a method is for a click to button find Specific Contact
     **/
    public void clickSearchContact()
    {
        click(TXT_FIND_CONTACT);
    }

    /**
     * This a method is for select a first contact of the Result List
     **/
    public void selectFirstUserOfList()
    {
        click(SELECT_A_CONTACT);
    }


    /**
     * This a method is for wait to load the Search Elements
     **/
    public void loadSearchElemens()
    {
        handlingWaitToElement(TXT_SEARCH_CONTACT);
        handlingWaitToElement(BTN_CLOSE_SEARCH);
    }

    /**
     * This a method is for do click to open the Back Page Button of Search
     **/
    public void clickBackSearchPage()
    {
        click(BTN_CLOSE_SEARCH);
    }

    /**
     * This a method is for search a specific contact by Name of Contact
     * @param contactName
     **/
    public void findSpecificContact(String contactName)
    {
        loadSearchElemens();
        sendKeys(TXT_SEARCH_CONTACT, contactName);
    }

    /**
     * This a method is for wait Result Element after a search
     **/
    public void loadElemensAfterSearch()
    {
        handlingWaitToElement(CONTACT_FOUND);
    }

    /**
     * This a method is for select a specific contact after a search
     * This method assert the contact selected is equal to search
     * @param contactName
     **/
    public void selectContactAfterSearch(String contactName)
    {
        loadElemensAfterSearch();
        System.out.println("The Result of Search show correctly");
        click(CONTACT_FOUND);
    }
}
