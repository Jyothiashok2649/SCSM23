package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newctmoption;
	
	@FindBy(xpath="//input[ @placeholder='Enter Customer Name' and @class]")
	private WebElement Enterctmname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterctmdesciption;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewctmoption() {
		return newctmoption;
	}

	public WebElement getEnterctmname() {
		return Enterctmname;
	}

	public WebElement getEnterctmdesciption() {
		return enterctmdesciption;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
	
}
