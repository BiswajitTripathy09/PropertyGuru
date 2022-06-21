package com.testScript;

import org.testng.annotations.Test;

import com.pages.*;

public class HyperLink {
	@Test
	public void hyperlink() {
		Hyperlink ob=new Hyperlink();
		
		ob.OpenApplication();
//		ob.login1("biswajittripathy09@gmail.com","Sunita@007");
		ob.hyperLink();
		ob.CloseApplication();

}

}