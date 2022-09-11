package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.pom.EnterTimeTrackpage;
@Listeners(com.actitime.generic.listernars.class)

public class Customarmadule extends Baseclass{
	@Test
	public void createcustomar()
	{
		EnterTimeTrackpage e= new EnterTimeTrackpage(driver);
		e.settasktab(); 
	}

}
