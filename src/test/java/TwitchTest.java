import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitchTest {
	
	WebDriver driver;
//	WebDriverWait wait = new WebDriverWait(driver, 10);
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\Desktop\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void signupTest() throws InterruptedException {
		driver.get("https://temp-mail.org/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		Random r = new Random();
		int number = r.nextInt(999999);
		
		
		Home homePage = PageFactory.initElements(driver, Home.class);
		Mail mailPage = PageFactory.initElements(driver, Mail.class);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mail")));
		
		String emailAddress = mailPage.getEmailAddress().getAttribute("value");
		System.out.println(emailAddress);
		
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://twitch.tv/signup");
		
//		actions.sendKeys(Keys.CONTROL + "t").perform();
		
//		driver.get("https://twitch.tv/signup");
		
//		homePage.getSignupButton().click();
		Thread.sleep(2000);
//		actions.moveToElement(homePage.getEmail()).click().perform();
//		actions.sendKeys(emailAddress).perform();

//		actions.moveToElement(homePage.getUsername()).perform();
//		actions.sendKeys("testuser"+number).perform();
//
//		Thread.sleep(2000);
//		actions.moveToElement(homePage.getPassword()).perform();
//		actions.sendKeys("Testpass"+number).perform();
//		actions.moveToElement(homePage.getMonth()).perform();
//		actions.click().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
//		actions.moveToElement(homePage.getDay()).perform();
//		actions.sendKeys("1").perform();
//		actions.moveToElement(homePage.getYear()).perform();
//		actions.sendKeys("1990").perform();
//		Thread.sleep(2000);
//		actions.sendKeys(Keys.ENTER).perform();
		
		
		
//		
		homePage.getUsername().sendKeys("testuser"+number);
		
		homePage.getPassword().sendKeys("Testpass"+number);
		homePage.getMonth().click();
		actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		homePage.getDay().sendKeys("1");
		homePage.getYear().sendKeys("1990");
		homePage.getEmail().sendKeys(emailAddress);
		Thread.sleep(2000);
		homePage.getSignupButton().click();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(20000);
		
		
		
	}
}
