package com.testScript;
import com.pages.*;

import org.testng.annotations.Test;

import com.Utility.*;
public class UserLogin {

	@Test
		public void Login() {
		Login ob=new Login();
		
		ob.OpenApplication();
		ob.login1("biswajittripathy09@gmail.com","Sunita@007");
		//Thread.sleep(6000);
		ob.CloseApplication();
	}
}
