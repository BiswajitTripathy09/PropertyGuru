package com.testScript;

import com.pages.*;

public class UserSearchLocation {
	public static void main(String args[]) {
		SearchLocation SearchL=new SearchLocation();
		SearchL.OpenApplication();
		SearchL.searchLocation();
//		Thread.sleep(6000);
		SearchL.CloseApplication();
	}

}
