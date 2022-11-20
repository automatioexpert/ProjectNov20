package rough;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T2 {

	@Parameters({"s @Optional"})
	@Test
	public void t1(String m1) {
		System.out.println(m1.length());

	}
}
