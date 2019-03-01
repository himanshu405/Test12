import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Batch20180701\\Test12\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com"); // open automationpractice page
		driver.manage().window().maximize(); // maximize browser
		driver.manage().deleteAllCookies(); //Delete cookies
		
		String title = driver.getTitle(); //Get browser title
		
		System.out.println(title);
		
		if (title.equals("My Store")) {
			System.out.println("Correct");
				}
		else {
			System.out.println("Incorrect");
		}
		// clicking on login
		driver.findElement(By.className("login")).click();
		
		//entering email add
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		//entering password
		driver.findElement(By.id("passwd")).sendKeys("password");
		
		//clicking on login button
		driver.findElement(By.id("SubmitLogin")).click();
		
		//clicking on contact us
		driver.findElement(By.id("contact-link")).click();
		
		//selecting value from dropdown
		Select select = new Select(driver.findElement(By.id("id_contact")));
		select.selectByVisibleText("Webmaster");
		
		//entering email add
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		//entering order ref#
		driver.findElement(By.id("id_order")).sendKeys("12345");
		
		//typing message
		driver.findElement(By.id("message")).sendKeys("This is message field box");
		
		//click on send
		driver.findElement(By.id("submitMessage")).click();
		
		
		// Locator id for woman = a.sf-with-ul or li.sfHoverForce or #block_top_menu > ul > li.sfHoverForce > a
		// Locator id for Dresses = 
		//driver.quit();

	}

}
