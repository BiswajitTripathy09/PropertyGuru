package com.testScript;

import org.testng.annotations.Test;

import com.pages.*;

public class UserSearchLocation {
	@Test
	public void searchL() {
		
		SearchLocation SearchL=new SearchLocation();
		SearchL.OpenApplication();
		SearchL.searchLocation();
//		Thread.sleep(6000);
		SearchL.CloseApplication();
	}

}
