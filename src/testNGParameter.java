import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNGParameter {

	@Test(dataProvider="getData")
	public void testFormFill(String username, String password, int age){
		System.out.println(username +"----"+ password+"----"+age);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data =new Object[2][3];
		data[0][0]="Kapilan";
		data[0][1]="abc";
		data[0][2]=30;
		
		data[1][0]="Ahilan";
		data[1][1]="abc";
		data[1][2]=32;

		return data;
		
	}
}
