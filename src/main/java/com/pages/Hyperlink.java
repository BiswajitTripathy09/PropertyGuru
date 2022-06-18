package com.pages;

import org.openqa.selenium.By;

import com.Utility.BaseClass;

public class Hyperlink extends BaseClass{

	static By Buy=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[1]/a");
	static By Rent=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[2]/a");
	static By Condos=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[3]/a");
	static By HDB=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[4]/a");
	static By NewProjects=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[5]/a");
	static By Mortgages=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[6]/a");
	static By Overseas=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[7]/a");
	static By FindAgent=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[9]/a");
	static By Guides=By.xpath("//*[@id=\"navbar-main\"]/div/div[2]/ul[2]/li[10]/a");
	
	public void hyperLink() {
		driver.findElement(Buy).click();
		driver.findElement(Rent).click();
		driver.findElement(Condos).click();
		driver.findElement(HDB).click();
		driver.findElement(NewProjects).click();
		driver.findElement(Mortgages).click();
		driver.findElement(Overseas).click();
		driver.findElement(FindAgent).click();
		driver.findElement(Guides).click();
	}
}
