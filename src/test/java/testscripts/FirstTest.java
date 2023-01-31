package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {

	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getpageHeader().isDisplayed());
		demoApp.mouseHoverTocourseTab(web);
		demoApp.clickSeleniumTrainingLink();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.screenShot();
		
		soft.assertAll();
		
	}
	
}
