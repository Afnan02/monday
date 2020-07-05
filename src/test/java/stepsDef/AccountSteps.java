package stepsDef;

import com.Test.Util.TestBase;
import com.Test.pageAction.AccountPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AccountSteps extends TestBase {
	
	AccountPageAction action = new AccountPageAction();

	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get(prop.getProperty("url"));
	}
	
	@Then("^user click on Account$")
	public void user_click_on_Account() throws Throwable {
		action.clickonAccount();
	}
	@Then("^click on Signin button$")
	public void click_on_Signin_button() throws Throwable {
	   action.clickonSigninbutton();
	
	}
    
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_password(String username, String password) throws Throwable{
		action.enterusercredential(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	@Then("^click on The Signin button$")
	public void click_on_The_Signin_button() throws Throwable {
	  action.clickonTheSigninbutton();
	
	}

}
