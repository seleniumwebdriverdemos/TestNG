import org.testng.SkipException;
import org.testng.annotations.Test;

public class testTwo {

	@Test
	public void testCaptureScreen(){
		System.out.println("Capturing Screen Test");
		throw new SkipException("Skipping the testcase");
	}
}
