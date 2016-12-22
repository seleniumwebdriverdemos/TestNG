import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataProviders {

/*	@Test(dataProvider="dp1")
	public void testData(String username, String password){
		
		System.out.println(username + "---"+password);
	}*/
	
	@DataProvider(name="dp1")
	public static Object[][] getData(){
		
		
		Object[][] data= new Object[2][2];
		
		data[0][0] = "kapilan";
		data[0][1] = "selvanathan";
		

		data[1][0] = "Ahilan";
		data[1][1] = "selvanathan";
		return data;
	}
	
	@DataProvider(name="dp2")
	public static Object[][] getData2(){
		
		
		Object[][] data= new Object[2][3];
		
		data[0][0] = "kapilan";
		data[0][1] = "selvanathan";
		data[0][2] = "k.s";

		data[1][0] = "Ahilan";
		data[1][1] = "selvanathan";
		data[1][2] = "a.s";
		return data;
	}
	
/*	
 * Same Data Provider for  different methods with different parameters
	@DataProvider(name="dp2")
	public static Object[][] getData2(Method m){

		Object[][] data= null;
		
		if(m.getName().equals("testData"))
		{
			data= new Object[2][2];
		
		data[0][0] = "kapilan";
		data[0][1] = "selvanathan";
	
		data[1][0] = "Ahilan";
		data[1][1] = "selvanathan";
			} else if(m.getName().equals("testUserReg"))
		{
			data= new Object[2][3];
				
		data[0][0] = "kapilan";
		data[0][1] = "selvanathan";
		data[0][2] = "k.s";

		data[1][0] = "Ahilan";
		data[1][1] = "selvanathan";
		data[1][2] = "a.s";
		}
		return data;
	}*/
}
