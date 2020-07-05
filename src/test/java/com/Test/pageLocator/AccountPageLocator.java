package com.Test.pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Test.Util.TestBase;

public class AccountPageLocator extends TestBase {

public AccountPageLocator() {
	
	PageFactory.initElements(driver, this);
	
	
}
@FindBy(how=How.XPATH, using="//*[@id=\"header-account-toggle\"]/span/span/span[1]/img")
public WebElement cliclonAccount;


@FindBy(how=How.XPATH, using="//*[@id=\"signed-out\"]/a[1]/div/span/div")
public WebElement clickonSigninbutton;

@FindBy(how=How.ID, using="email")
public WebElement username;

@FindBy(how=How.ID, using="password")
public WebElement password;


@FindBy(how=How.XPATH, using="//*[@id=\"sign-in-form\"]/button[1]")
public WebElement clickonTheSigninbutton;

	
}