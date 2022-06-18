package com.testScript;
import com.pages.*;
import com.Utility.*;
public class UserLogin {

	public static void main(String args[])throws Exception {
		Login ob=new Login();
		
		ob.OpenApplication();
		ob.login1("biswajittripathy09@gmail.com","Sunita@007");
		Thread.sleep(6000);
		ob.CloseApplication();
	}
}
