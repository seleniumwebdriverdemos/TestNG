import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testParameterizationExcel {

	public static ExcelReader excel= null;
	
	@Test(dataProvider="getData")
	public void testData(String username, String password, String is_correct){
		System.out.println(username + "---"+ password + "---"+ is_correct);
	}
	
	@DataProvider
	public static Object[][] getData(){
	//	
		
		if(excel==null){
			excel= new ExcelReader("C:\\testStorage\\Junit Sample\\TestNG Sample Project\\testngdata.xlsx");
			
		}
		String sheetName="loginTest";
		int rows= excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		
		
		Object[][] data= new Object[rows-1][cols];
		for(int rowNum=2; rowNum<=rows;rowNum++){
			
			for(int colNum=0;colNum<cols;colNum++){
				
				data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
			}
			
		}
		
		return data;
		
	}
}
