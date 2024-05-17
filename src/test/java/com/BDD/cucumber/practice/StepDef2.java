package com.BDD.cucumber.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model2.LoginPage2;
import com.uti2.BaseConfig2;
import com.uti2.SeleniuWait2;
import com.uti2.SeleniumHighlighter2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 {
	WebDriver driver;
	BaseConfig2 obj = new BaseConfig2();
	LoginPage2 pom = new LoginPage2();
	
	
	
@Given("open a browser")
public void open_a_browser() {
	driver = new ChromeDriver();
    
}

@Given("go to application url")
public void go_to_application_url() throws Exception {
	driver.get(obj.getConfig("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@Given("click signUp Btn")
public void click_signUp_Btn() {
	driver.findElement(pom.SignUp).click();
    
    
}

@When("put a valid user")
public void put_a_valid_user() throws Exception {
	driver.findElement(pom.User).sendKeys(obj.getConfig("USER"));
	SeleniumHighlighter2.getColor(driver, driver.findElement(pom.User),"red");
    
}

@When("put a valid password")
public void put_a_valid_password() throws Exception {
	driver.findElement(pom.Password).sendKeys(obj.getConfig("PASSWORD"));
	SeleniumHighlighter2.getColor(driver, driver.findElement(pom.Password),"green");
}

@When("click login Btn")
public void click_login_Btn() {
	driver.findElement(pom.LoginBtn).click();
	SeleniumHighlighter2.getColor(driver, driver.findElement(pom.LoginBtn),"blue");
    
}

@When("click dropDown Btn")
public void click_dropDown_Btn() {
	driver.findElement(pom.DropDown).click();
	SeleniumHighlighter2.getColor(driver, driver.findElement(pom.DropDown),"green");
}

@Then("Test will pass if logOut Btn found")
public void test_will_pass_if_logOut_Btn_found() throws Exception {
	
WebElement logOut = driver.findElement(pom.LogOutBtn);
SeleniuWait2.getExplicitWait(driver, logOut);

	boolean logOutFound = logOut.isDisplayed();

Thread.sleep(30000);
//driver.close();


				

    
}


}