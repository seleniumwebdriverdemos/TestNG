import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testOne {

	@Test
	public void doLogin(){
		System.out.println("@Test2");
	}
	
	@Test
	public void formFill(){
		System.out.println("@Test1");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void closeMethod(){
		System.out.println("@AfterMethod");
	}
	
	@BeforeTest
	public void createdbconn(){
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void closedbconn(){
		System.out.println("@AfterTest");
	}
	@BeforeSuite
	public void startSeleniumServer(){
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void stopSeleniumServer(){
		System.out.println("@AfterSuite");
	}
}
