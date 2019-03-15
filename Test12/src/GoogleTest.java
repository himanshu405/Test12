import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	@Test
	public void googleTitleTest(){
	String title = driver.getTitle();
	System.out.println(title);
	//driver.findElement(By.xpath("//*[@id='q']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id='q']")).sendKeys("This is a Test");
	//Thread.sleep(2000);
	}
	
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	@Test
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
}
