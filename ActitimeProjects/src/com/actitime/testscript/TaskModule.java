package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class TaskModule extends Baseclass{
	@Test
	public void createTask()
	{
		Reporter.log("createTask",true);
	}
	@Test
	public void DeleteTask()
	{
		Reporter.log("DeleteTask",true);
	}
	@Test
	public void modifyTask()
	{
		Reporter.log("modifyTask",true);
	}
	

	

}
