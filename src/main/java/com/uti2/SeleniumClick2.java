package com.uti2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClick2 {

	public void getExplicitWait(WebDriver driver, WebElement element){
		Actions act = new Actions(driver);
		act.click(element).build().perform();
		
		
	}
	public void javScriptClick(WebDriver driver,WebElement element ) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();element");
	}
}
