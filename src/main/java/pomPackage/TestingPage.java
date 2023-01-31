package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath = "//h1[@class='page-header']") private WebElement pageHeader;
	@FindBy(id = "java") private WebElement javaImage;
	@FindBy(id = "mycart") private WebElement cartArea;
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]") private WebElement facebookIcon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public WebElement getJavaImage() {
		return javaImage;
	}
	public WebElement getCartArea() {
		return cartArea;
	}
	public WebElement getFaceBookIcon() {
		return facebookIcon;
	}
	public void clickFacebookIcon() {
	       facebookIcon.click();
	}

}
