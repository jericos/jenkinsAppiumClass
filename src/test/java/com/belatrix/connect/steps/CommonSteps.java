package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class CommonSteps extends ParentScenario {
    @Given("^I login with my \"(.*?)\" and my \"(.*?)\"$")
    public void i_login_with_my_and_my(String username, String password) {
        startAndroid();
        loginPage.takingSessionActivity();
        System.out.println("I open the app");
        loginPage.takingSessionActivity();
        System.out.println("The App is loaded successfully");
        System.out.println("I login with recorder credentials");
        loginPage.loginOnApp(username, password);
    }

    @Then("^I'm on my profile page$")
    public void i_m_on_my_profile_page() {
        newsPage.clickSkipButtom();
        mainProfilePage.loadPageSucessfully();
        System.out.println("Profile Page is loaded sucessfully");
    }

    @And("^I finally Logout of App$")
    public void i_finally_Logout_of_App() {
        mainProfilePage.openMenuSideBar();
        System.out.println("I click on Side Bar LogOut Session");
        sideBarNavigation.logOutUserSession();
        System.out.println("The confirmation message is displayed");
        alertMessageTwoOptions.waitForAlertMessage();
        System.out.println("I confirm the logout session");
        alertMessageTwoOptions.answerYes();
        System.out.println("I logout session successfully");
        closeDriver();
    }
}
