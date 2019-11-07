package com.app.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage {
	
	public DressesPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement small;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement medium;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement large;
	
	public WebElement smallSize() {
		return small;
	}
	public WebElement mediumSize() {
		return medium;
	}
	public WebElement largeSize() {
		return large;
	}
	
	@FindBy(xpath ="")
	
	private List<WebElement> tableCount;
	private List<WebElement> headCount;
	
	public int gettableCount() {
		return tableCount.size();
	}
	public int getheadCount() {
		return headCount.size();
	}
	
}
