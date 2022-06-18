package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.Utility.BaseClass;

public class Login extends BaseClass {
	static By username=By.xpath("//input[@id='login-userid']");
	static By password=By.xpath("//input[@id='login-password']");
	static By Login=By.xpath("//button[text()='Log In'][@id='btn_login']");
	static By Login2=By.linkText("Login");
	
public void login1(String un,String pw)  {
	driver.findElement(Login2).click();
	driver.findElement(username).sendKeys(un);
	driver.findElement(password).sendKeys(pw);
	driver.findElement(Login).click();
}


}