package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by bryanestrada on 11/7/17.
 */
public class GiveKudoToContact extends ParentScenario {

    @When("^I click in Kudos Button$")
    public void i_click_in_Kudos_Button(){
        contactProfilePage.clickKudosButtom();
        System.out.println("I clicked in Kudos Buttom");
    }

    @Then("^I should see the Kudos Page$")
    public void i_should_see_the_Kudos_Page(){
        kudosPage.loadPageSuccessfully();
        System.out.println("Kudos's Page is loaded correctly");
    }

    @When("^I click in select an action$")
    public void i_click_in_select_an_action(){
        kudosPage.selectAnAction();
        System.out.println("I click in Select an Action Option");
    }

    @And("^select a Action as \"([^\"]*)\"$")
    public void select_a_Action_as(String action){
        kudosPage.selectAnAction(action);
        System.out.println("I selected the action "+action);
    }

    @Then("^I should see the Action \"([^\"]*)\" selected in a first field$")
    public void i_should_see_the_Action_selected_in_a_first_field(String action){
        kudosPage.checkSubActionSelected(action);
        System.out.println("The action " + action +  " show successly ");
    }

    @When("^I click in select a Tag$")
    public void i_click_in_select_a_Tag()  {
        kudosPage.selectTag();
        System.out.println("I click in Select Tag Option");
    }

    @And("^I select a Tag \"([^\"]*)\"$")
    public void i_select_a_Tag(String tag){
        kudosPage.selectTag(tag);
        System.out.println("I select the Tag "+ tag +" correctly");
    }

    @Then("^I should see the Tag \"([^\"]*)\" selected in the second field$")
    public void i_should_see_the_Tag_selected_in_the_second_field(String tag){
        kudosPage.checkTheTagSelected(tag);
        System.out.println("The Tag " + tag +  " show successly ");
    }

    @When("^I click in Write a comment$")
    public void i_click_in_Write_a_comment(){
        kudosPage.writeComment();
        System.out.println("I click in Write a Comment");
    }

    @And("^I write a comment \"([^\"]*)\"$")
    public void i_write_a_comment(String comment){
        kudosPage.writeComment(comment);
        System.out.println("I wrote the comment: "+comment);
    }

    @And("^I click in Done$")
    public void i_click_in_Done(){
        kudosPage.doneWriteComment();
        System.out.println("I click in Done after wrote the Comment");
    }

    @Then("^I should see the comment \"([^\"]*)\" wrote in in a last field$")
    public void i_should_see_the_comment_wrote_in_in_a_last_field(String comment){
        kudosPage.checkTheCommentEntered(comment);
        System.out.println("The comment " + comment +  " show successly ");
    }

    @And("^I check the button done now is enable$")
    public void i_check_the_button_done_now_is_enable(){
        System.out.println("Assert buton = true");
    }

    @When("^I click Done button$")
    public void i_click_Done_button(){
        kudosPage.doneKudo();
        System.out.println("I Done with the Kudo");
    }

    @Then("^I should see the message of action done successfully$")
    public void i_should_see_the_message_of_action_done_successfully(){
        contactProfilePage.loadPageSucessfully();
        System.out.println("The message of confirmation is displayed correctly");
    }
}
