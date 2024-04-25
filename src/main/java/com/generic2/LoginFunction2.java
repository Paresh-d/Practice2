package com.generic2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.object.model2.LoginPage2;
import com.uti2.BaseConfig2;
import com.uti2.SeleniuWait2;
import com.uti2.SeleniumHighlighter2;

public class LoginFunction2 {
		
		public void getLogin2() throws Exception{
		
	
		WebDriver driver = new ChromeDriver();
		BaseConfig2 obj = new BaseConfig2();
		driver.get(obj.getConfig("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							
		LoginPage2 pom = new LoginPage2();
		driver.findElement(pom.SignUp).click();
		SeleniumHighlighter2.getColor(driver, driver.findElement(pom.User),"red");
		
		driver.findElement(pom.User).sendKeys(obj.getConfig("USER"));
		
		SeleniumHighlighter2.getColor(driver, driver.findElement(pom.Password),"green");
		driver.findElement(pom.Password).sendKeys(obj.getConfig("PASSWORD"));
		
		SeleniumHighlighter2.getColor(driver, driver.findElement(pom.LoginBtn),"blue");
		driver.findElement(pom.LoginBtn).click();
		
		SeleniumHighlighter2.getColor(driver, driver.findElement(pom.DropDown),"green");
		driver.findElement(pom.DropDown).click();
						
		WebElement logOut = driver.findElement(pom.LogOutBtn);
		SeleniuWait2.getExplicitWait(driver, logOut);
		
				boolean logOutFound = logOut.isDisplayed();
		
		Thread.sleep(30000);
          //driver.close();
		

							
		}

		
	
	
	
}
