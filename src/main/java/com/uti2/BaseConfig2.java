package com.uti2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig2 {

	public String getConfig(String value) throws Exception{
		String filepath="./com.property2";
		FileInputStream fis = new FileInputStream(filepath);
		Properties pro = new Properties();
		pro.load(fis);
		String eachValue = pro.get(value).toString();
		//System.out.println(eachValue);
		return eachValue;
				
	}
public static void main(String[] args) throws Exception {
	BaseConfig2 obj = new BaseConfig2();
	obj.getConfig("URL");
}
}
