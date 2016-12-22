import org.testng.annotations.Test;

public class testGroup2 {

	@Test(groups={"low"})
	public void validateTicket(){
		
		System.out.println("Validate Tickets");
	}
}
