package mymavenproject11;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	@Test
@Parameters({"username","password"})
	public void testcase1(String u, String p) {
		System.out.println(u);
		System.out.println(p);
		System.out.println("Testcase one");
	}
	@Test
	@Parameters({"name", "class"})
	public void testcase2(String n, String c) {
		System.out.println(n);
		System.out.println(c);
		System.out.println("Testcase 2");
}
	
}
