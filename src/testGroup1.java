import org.testng.annotations.Test;

public class testGroup1 {

	@Test(priority=1, groups={"high"})
	public void doLogin(){
		System.out.println("Login");
		
	}
	@Test(priority=2, groups={"med"})
	public void fillForm(){
		System.out.println("fillForm");
		
	}
	@Test(priority=3, groups={"high"})
	public void bookTickets(){
		
		System.out.println("bookTickets");
	}
	
	@Test(priority=4, groups={"low"})
	public void searchFlights(){
		System.out.println("searchFlighhts");
		
	}
}
