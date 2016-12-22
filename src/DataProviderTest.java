
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProviderClass=testDataProviders.class,dataProvider="dp1")
	public void testData(String username, String password){
		
		System.out.println(username + "---"+password);
	}
	
	@Test(dataProviderClass=testDataProviders.class,dataProvider="dp2")
	public void testUserReg(String fname,String lname, String email){
		
		System.out.println(fname + "---"+lname+ "---"+email);
	}
	
	
}
