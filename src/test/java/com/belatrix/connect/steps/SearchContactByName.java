package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class SearchContactByName extends ParentScenario {

    @When("^I click on Contacts Tab$")
    public void I_click_on_Contacts_Tab() {
        mainProfilePage.clickContactTab();
        System.out.println("I click on contact TAB");
        contactsPage.loadPageSucessfully();
    }

    @And("^I click on find a Contact$")
    public void i_click_on_find_a_Contact() {
        contactsPage.clickSearchContact();
        System.out.println("I click on Find a specific contact");
    }

    @And("^type the next Contact \"(.*?)\"$")
    public void type_the_next_Contact(String contactName) {
        contactsPage.findSpecificContact(contactName);
        System.out.println("I find a contact by name: " + contactName);
    }

    @And("^click over the field of this Contact \"(.*?)\"$")
    public void click_over_the_field_of_this_Contact(String contactName) {
        contactsPage.selectContactAfterSearch(contactName);
        System.out.println("i select the contact found");
    }

    @Then("^I should see the Profile User found")
    public void i_should_see_the_Profile_User_found() {
        contactProfilePage.loadPageSucessfully();
        System.out.println("The profile of user selected load successfully");
    }

    @And("I back on Pages to Logout of APP$")
    public void I_back_on_Pages_to_Logout_of_APP() {
        contactProfilePage.clickBackPage();
        contactsPage.clickBackSearchPage();
        mainProfilePage.clickProfileTab();
        System.out.println("I back on pages to main Page");
    }
}
