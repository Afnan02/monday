package com.Test.pageAction;

import com.Test.pageLocator.AccountPageLocator;

public class AccountPageAction {
	
	AccountPageLocator locator = new AccountPageLocator();


public void  clickonAccount() {
	 locator.cliclonAccount.click();
	 
}
public void clickonSigninbutton() {
	locator.clickonSigninbutton.click();
}

public void enterusercredential(String username, String password){
	locator.username.clear();
	locator.username.sendKeys(username);
	locator.password.clear();
	locator.password.sendKeys(password);
}

public void clickonTheSigninbutton() {
	locator.clickonTheSigninbutton.click();
}
	


}