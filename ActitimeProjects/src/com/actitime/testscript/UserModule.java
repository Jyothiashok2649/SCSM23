package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class UserModule extends Baseclass {
	@Test
	public void createUser()
	{
		Reporter.log("createUser",true);
	}
	@Test
	public void DeleteUser()
	{
		Reporter.log("DeleteUser",true);
	}
	@Test
	public void modifyUser()
	{
		Reporter.log("modifyUser",true);
	}
	

	

}
