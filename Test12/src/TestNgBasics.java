import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
//	@BeforeSuite -- Setup system property for chrome -- 1st pref
//	@BeforeTest -- launchBrowser -- 2nd pref
//	@BeforeClass -- login to app -- 3rd pref
	
//	@BeforeMethod -- enter URL --4th pref to test (BeforeMethod-Test-AfterMethod runs in order)
//	@Test -- google logo test
//	@AfterMethod -- Logout from App
	
//	@BeforeMethod -- enter URL
//	@Test -- Google Title Test
//	@AfterMethod -- Logout from App
	
//	@BeforeMethod -- enter URL
//	@Test -- searchTest
//	@AfterMethod -- Logout from App
	
//	@AfterClass -- Close Browser
//	@AfterTest -- Delete All coockies

	//pre-conditions annotations -- Starting with @Before
	@BeforeSuite //1
		public void setup(){
		System.out.println("@BeforeSuite -- Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser(){
	System.out.println("@BeforeTest -- launchBrowser");
    }
	
	@BeforeClass //3
	public void login(){
	System.out.println("@BeforeClass -- login to app");
	}
	
	@BeforeMethod //4
	public void enterURL(){
	System.out.println("@BeforeMethod -- enter URL");
    }
	
	// test cases -- Starting with @Test
	@Test //5
	public void googleTitleTest(){
		System.out.println("@Test -- Google Title Test");
	}
	@Test
	public void searchTest(){
		System.out.println("@Test -- searchTest");
	}
	@Test
	public void googleLogoTest(){
		System.out.println("@Test -- google logo test");
	}
	
	//post conditions -- starting with @After
	@AfterMethod //6
	public void logOutFromApp(){
	System.out.println("@AfterMethod -- Logout from App");
    }
	
	@AfterClass //7
	public void CloseBrowser(){
	System.out.println("@AfterClass -- Close Browser");
    }
	
	@AfterTest //8
	public void deleteAllCookies(){
	System.out.println("@AfterTest -- Delete All coockies");
    }
	
	@AfterSuite
	public void generateTestReport() {
	System.out.println("generateTestReport");
	}

}