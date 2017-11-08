package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.testng.Assert;


public class LoginScenariesSteps extends ParentScenario {
    @Given("^I open the APP$")
    public void i_open_the_APP(){
        startAndroid();
        loginPage.takingSessionActivity();
        System.out.println("La aplicacion se inicio correctamente");

    }

    @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_enter_my_and(String username, String password) {
        loginPage.loginOnApp(username,password);
        System.out.println("Ingreso correctamente el Usuario y Contraseña");
    }

    @When("^I click in sigin button$")
    public void i_click_in_sigin_button(){
        loginPage.clickSingIn();
        System.out.println("Ingreso Correctamente a la Applicacion");
        newsPage.clickSkipButtom();
    }

    @Then("^I see the complete name \"([^\"]*)\" in the profile screen$")
    public void i_see_the_in_the_complete_name_profile_screen(String name) {
        Assert.assertEquals(mainProfilePage.getName(),name);
    }

    @Then("^I see the email \"([^\"]*)\" in the profile screen$")
    public void i_see_the_email_in_the_profile_screen(String email) throws Throwable {
        Assert.assertEquals(mainProfilePage.getEmail(),email);
    }

    @Then("^I see the skypeId \"([^\"]*)\" in the profile screen$")
    public void i_see_the_skypeId_in_the_profile_screen(String skypeId) throws Throwable {
        Assert.assertEquals(mainProfilePage.getSkypeId(),skypeId);
    }

    @Then("^I see the location \"([^\"]*)\" in the profile screen$")
    public void i_see_the_location_in_the_profile_screen(String location) throws Throwable {
        Assert.assertEquals(mainProfilePage.getLocation(),location);
    }

}
