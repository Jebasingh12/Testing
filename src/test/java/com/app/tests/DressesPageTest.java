package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.DressesPageObject;
import com.app.pages.HomePageObjects;

public class DressesPageTest extends BasePage{
	DressesPageObject dp;
	BasePage bp;
	HomePageObjects hp;
	
	public DressesPageTest() {
		dp = new DressesPageObject();
		bp = new BasePage();
		hp = new HomePageObjects();
	}
	@Test
	public void tabDresses() {
		hp.clickDresses();
		Assert.assertTrue(bp.getTitle().contains("Dresses"));
	}
	@Test
	public void verificationSizes() {
		Assert.assertTrue(bp.elementFound(dp.smallSize()));
		Assert.assertTrue(bp.elementFound(dp.mediumSize()));
		Assert.assertTrue(bp.elementFound(dp.largeSize()));
	}
	@Test
	public void verifyCount() {
		int tableCount = dp.gettableCount();
		int headCount = dp.getheadCount();
		Assert.assertTrue(tableCount==headCount);
	}

}
