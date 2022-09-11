package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackpage;
import com.actitime.pom.Loginpage;

public class Baseclass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		Reporter.log("openbrowser",true);
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	
	}
	@AfterTest
	public void closebrowser() {
		Reporter.log("closebrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        FileLib f=new FileLib();
        String url = f.getpropertydata("url");
        String username = f.getpropertydata("username");
        String password = f.getpropertydata("password");
        driver.get( url);
        Loginpage l=new Loginpage();
        PageFactory.initElements(driver, l);
       l.setlogin( "admin", "manager");
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackpage e=new EnterTimeTrackpage(driver) ;
	    e.setlogout();
	}

}
