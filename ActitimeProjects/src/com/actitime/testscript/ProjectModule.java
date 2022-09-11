package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class ProjectModule extends Baseclass{
	
	@Test
	public void createproject()
	{
		Reporter.log("createproject",true);
	}
	@Test
	public void Deleteproject()
	{
		Reporter.log("Deleteproject",true);
	}
	@Test
	public void modifyproject()
	{
		Reporter.log("modifyproject",true);
	}
	

	

}
