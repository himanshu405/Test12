import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2017\\git\\Test12\\Test12\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		// type 'Himanshu' in searchbox
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("Himanshu");
		Thread.sleep(2000);
		// clear typed 'Himashu' from search box
		driver.findElement(By.xpath("//input[@name ='q']")).clear();
		Thread.sleep(2000);
		// how to get text
		WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(element.getText());
		//clicking on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		//50 - How to press enter keys in selenium webdriver
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Images']")).sendKeys(Keys.ENTER);
		//click on google apps and hover over to play and click
		
		
		
		
		
		//driver.quit();
		

	}

}
