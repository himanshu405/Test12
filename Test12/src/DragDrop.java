
//public class DragDrop {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragDrop {

		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("https://jqueryui.com/droppable/");
			
			// added (0) cuz there is only one frame
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			
			//create action class
			Actions action = new Actions(driver);
			
			action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
			.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
			.release()
			.build()
			.perform();
			Thread.sleep(2000);
			
					
			
			driver.quit();
			

		}

	}

