package com.TestMayurkumar.StapDefinitions;

import com.TestMayurkumar.PageObject.MyAccount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountSteps {

    MyAccount myAccount = new MyAccount();

    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
    myAccount.signInButton();
    }
    @When("user add his credentials details and click on signin button")
    public void user_add_his_credentials_details_and_click_on_signin_button() {
    myAccount.signInProcess();
    }
    @When("user click the my personal information options")
    public void user_click_the_my_personal_information_options() {
    myAccount.PersonalInformationButton();
    }
    @When("user updated his firstname and saved successfully.")
    public void user_updated_his_firstname_and_saved_successfully() {
        myAccount.updatePersonalInformation();
    }
    @Then("user should get message your personal information has been successfully updated.")
    public void user_should_get_message_your_personal_information_has_been_successfully_updated() {
    myAccount.updatedMessage();
    }

}
