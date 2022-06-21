package com.pages;

import org.openqa.selenium.By;

import com.Utility.BaseClass;

public class Hyperlink extends BaseClass{

	static By Buy=By.linkText("Buy");
	static By rent=By.linkText("Rent");
	static By Condos=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[3]/a");
	static By HDB=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[4]/a");
	static By NewProjects=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[5]/a");
	static By Mortgages=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[6]/a");
	static By Overseas=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[7]/a");
	static By FindAgent=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[9]/a");
	static By Guides=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[10]/a");
	
	public void hyperLink() {
		driver.findElement(Buy).click();
		driver.navigate().back();
		driver.findElement(rent).click();
		driver.navigate().back();
		driver.findElement(Condos).click();
		driver.navigate().back();
		driver.findElement(HDB).click();
		driver.navigate().back();
		driver.findElement(NewProjects).click();
		driver.navigate().back();
		driver.findElement(Mortgages).click();
		driver.navigate().back();
		driver.findElement(Overseas).click();
		driver.navigate().back();
		driver.findElement(FindAgent).click();
		driver.navigate().back();
		driver.findElement(Guides).click();
		driver.navigate().back();
	}
}
