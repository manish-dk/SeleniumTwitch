import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mail {
	@FindBy(xpath="//*[@id=\"mails\"]/tbody/tr/td[1]/a")
	private WebElement firstEmail;
	
	@FindBy(id="mail")
	private WebElement emailAddress;

	public WebElement getFirstEmail() {
		return firstEmail;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}


}
