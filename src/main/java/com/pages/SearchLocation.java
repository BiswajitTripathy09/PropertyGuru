package com.pages;

import org.openqa.selenium.By;

import com.Utility.BaseClass;

public class SearchLocation extends BaseClass {

	static By Drop=By.xpath("//*[@id=\"searchBoxOriginal\"]/div[4]/button/span[2]"); 
	static By Condo=By.linkText("Condo");
	static By Select=By.xpath("//*[@id=\"searchBoxOriginal\"]/div[4]/ul/li[4]/ul/li[1]/label/input");
	static By searchLoc =By.xpath("//*[@id=\"searchBoxOriginal\"]/div[2]/button/i");
	static By searchLoc1=By.xpath("//*[@id=\"searchBoxOriginal\"]/div[2]/div/div/ul/li[6]/label/input");
	static By search=By.xpath("//*[@id=\"searchBoxOriginal\"]/span[2]/button");
	
	public void searchLocation() {
		//Select ho=new Select(driver.findElement(Drop));
		//ho.selectByValue();
		driver.findElement(searchLoc).click();
		driver.findElement(searchLoc1).click();
	
		driver.findElement(search).click();
		
	}
	
	
}
