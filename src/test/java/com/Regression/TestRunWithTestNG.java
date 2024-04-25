package com.Regression;

import org.testng.annotations.Test;

import com.generic2.LoginFunction2;

public class TestRunWithTestNG {

	
	@Test
	public void getLogin() throws Exception {
		LoginFunction2 obj = new LoginFunction2();
		obj.getLogin2();
	}
}
