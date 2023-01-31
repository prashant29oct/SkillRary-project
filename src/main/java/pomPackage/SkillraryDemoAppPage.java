package pomPackage;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	@FindBy(xpath = "//a[contains(text(),'-ECommerce')]") private WebElement pageHeader;
	@FindBy(id = "course") private WebElement courseTab;
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]") private WebElement seleniumTrainingLink;
	@FindBy(name = "addresstype") private WebElement categoryDropDown;
	@FindBy(xpath = "//a[text()='Contact Us']") private WebElement contactUsLink;
	
	public SkillraryDemoAppPage(WebDriver driver) {
	      PageFactory.initElements(driver,this);  
	}
	
	public WebElement getpageHeader() {
		return pageHeader;
	}
	public void mouseHoverTocourseTab(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTrainingLink() {
		seleniumTrainingLink.click();
	}
	public void selectCategory(WebDriverUtility web,int index) {
		web.dropDown(categoryDropDown, index);
	}
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	public void clickContactUs() {
		contactUsLink.click();
	}
	

}
