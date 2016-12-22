import org.testng.Assert;
import org.testng.annotations.Test;

public class testPriority {

	@Test(priority=1)
	public void testOne(){
		System.out.println("1");
		Assert.fail();
	}
	@Test(priority=2, dependsOnMethods={"testOne"})
	public void testTwo(){
		System.out.println("2");
	}
	@Test(priority=3, dependsOnMethods={"testOne"}, alwaysRun=true)
	public void testThree(){
		System.out.println("3");
	}
	@Test(priority=4, dependsOnMethods={"testOne"}, alwaysRun=true)
	public void testFour(){
		System.out.println("4");
	}
	
}
