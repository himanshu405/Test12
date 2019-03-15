import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InterviewQuestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2017\\git\\Test12\\Test12\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		/*Dimension d = new Dimension(480,620);
		driver.manage().window().setSize(d);*/
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
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
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div[1]/a")).click();
		Thread.sleep(3000);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"gb78\"]/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		action.click(menu).perform();
		
		//right click
		action.contextClick(driver.findElement(By.xpath("//*[@id=\"gb78\"]/span[2]"))).build().perform();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("lion");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[contains(@class, 'gbqfi gb_Vb')]")).click();
		driver.findElement(By.id("gbqfb")).click();                      
		//driver.findElement(By.xpath("//*[@id=\"body-content\"]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/a/span[2]"))
		
		
		
		driver.quit();
		

	}

}
