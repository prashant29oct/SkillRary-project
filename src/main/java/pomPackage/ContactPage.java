package pomPackage;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	@FindBy(xpath = "//img[contains(@src,'contactus')]") private WebElement contactUsImage;
	@FindBy(name = "name") private WebElement fullNameTF;
	@FindBy(name = "sender") private WebElement emailTF;
	@FindBy(name = "subject") private WebElement subjectTF;
	@FindBy(name = "message") private WebElement messageTA;
	@FindBy(xpath = "//button[text()='Send us mail']") private WebElement sendUsMailButton;
	
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getHeaderImage() {
		return contactUsImage;
	}
	public void setContactDetails(String name, String email, String subject, String message) {
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTA.sendKeys(message);
	}
	
	public void clickSendUsMailButton() {
		sendUsMailButton.click();
	}

}
