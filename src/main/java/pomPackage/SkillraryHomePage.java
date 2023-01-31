package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration
	@FindBy(xpath = "//img[@alt='SkillRary']") private WebElement logo;
	@FindBy(name = "q") private WebElement searchTF;
	@FindBy(xpath = "//input[@value='go']") private WebElement searchButton;
	@FindBy(xpath = "//a[text()=' GEARS ']") private WebElement gearsTab;
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]") private WebElement
	skillraryDempAppLinkElement;
	
	//Initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLogo() {
		return logo;
	}
	public void searchCourse(String text) {
		searchTF.sendKeys(text);
		searchButton.click();
	}
	public void clickGearsTab() {
		gearsTab.click();
	}
	public void clickSkillraryDemoAppLink() {
		skillraryDempAppLinkElement.click();
	}

}
