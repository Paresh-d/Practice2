package com.Regression;

import org.testng.annotations.Test;

import com.generic2.LoginFunction2;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestRunWithTestNGLogin2 {

	
	@Test( priority=0, description= "Login Fintion", groups = {"Smoke", "Regression", "Unit Test"})
	public void getLogin() throws Exception {
		LoginFunction2 obj = new LoginFunction2();
		obj.getLogin2();
	}
	
	
}