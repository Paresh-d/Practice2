package com.BDD.cucumber.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		plugin = "json:target//cucumberP2.json",
		features = "./src/main/resources/LoginP2.feature",
		glue = "com.BDD.cucumber.practice",
		tags = "@Unit"
		)



public class RunnerPractice2 extends AbstractTestNGCucumberTests{
	
	
	@BeforeTest
	public void setUp (){
		
		
	}
	
	@Test 
	public void test1 () {
			
	}
	
	
	@AfterTest
	public void tearDown () {
		
	}
	

	
}
