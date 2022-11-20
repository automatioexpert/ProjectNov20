package base;
import org.testng.annotations.Test;

public class TestCase1 extends TestBase {

	@Test(priority = 0)
	public void test1() {
		System.out.println("test1 called");
		
	}
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("test2 called");
		
	}
}
