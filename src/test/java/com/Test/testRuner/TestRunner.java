package com.Test.testRuner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Test.Util.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resources"} , format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue = "stepsDef",
tags= {"@test"})


public class TestRunner extends AbstractTestNGCucumberTests{
	
	
@BeforeTest
public void setUp(){
	TestBase test = new TestBase();
	test.initialization();
	
}


@AfterTest
public void tearDown(){
	TestBase test = new TestBase();
		//test.driver.quit();
}
}