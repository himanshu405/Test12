import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		 
		driver.get("https://www.google.com/");
		
		//take screenshot and store as a file format
		// we can take a screenshot by getscreenshotAs method
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\users\\2017\\git\\Test12\\Test12\\src\\google.png"));
		// now copy the screenshot to desired location using copyFile //method
		//where do you want to store your screenshot \\ in C: driver for src folder
		//FileUtils.copyFile(src, new File ("C:\\Users\\2017\\git\\Test12\\Test12\\src\\google.png")); 
		
		
		driver.quit();
		
	}

}