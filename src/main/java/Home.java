import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[5]/button/span")
	private WebElement signupButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[1]/div/div[2]/input")
	private WebElement username;

	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div/div[2]/div[1]/input")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[4]/div/div[2]/input")
	private WebElement email;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div/div[2]/div[1]/select")
	private WebElement month;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div/div[2]/div[2]/div/input")
	private WebElement day;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div/div[2]/div[3]/div/input")
	private WebElement year;

	public WebElement getSignupButton() {
		return signupButton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getYear() {
		return year;
	}

}
