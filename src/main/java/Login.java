import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[1]/div/div[2]/input")
	private WebElement username;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div/div[1]/div[2]/div[1]/input")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/nav/div/div[6]/div/div/div[1]/div/button/div/div[2]/div[1]/p")
	private WebElement loggedUser;
	
	public WebElement getLoggedUser() {
		return loggedUser;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}
