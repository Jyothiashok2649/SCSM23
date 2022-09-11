package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackpage {

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgout;
	
	@FindBy(id="container_tasks")
	private WebElement tasktab;
	
	public EnterTimeTrackpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setlogout() {
		lgout.click();
	}
	public void settasktab() {
		tasktab.click();
	}
}
