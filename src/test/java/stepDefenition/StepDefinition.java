package stepDefenition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.*;
@RunWith(Cucumber.class)
public class StepDefinition {

   /* @Given("^user is on login page$")
    public void user_is_on_login_page()  {
        System.out.println("user is on login page");
    }

    @When("^user login with username and password$")
    public void user_login_with_username_and_password() {
    	System.out.println("user login with username and password");
    }

    @Then("^homepage is populated$")
    public void homepage_is_populated()  {
    	System.out.println("homepage is populated");
    }

    @And("^all cards are displayed$")
    public void all_cards_are_displayed()  {
    	System.out.println("all cards are displayed");
    }*/
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	    
	}
	/*@When("^user login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_username_something_and_password_something(String strArg1, String strArg2)  {
        
    
		System.out.println("user login with username "+strArg1 + " and password "+ strArg2);
	    
	}*/
	

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



	@Then("homepage is populated")
	public void homepage_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("homepage is populated");
	    
	}
	 @And("^cards displayed \"([^\"]*)\"$")
	    public void cards_displayed_something(String strArg1)  {
	      System.out.println("cards displayed " + strArg1);
	      System.out.println("github repo rrrrrr");
	      System.out.println("ggggggggggggggggggg");
	    }



}