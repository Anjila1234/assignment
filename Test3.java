package mymavenproject11;

import org.testng.annotations.Test;

public class Test3 {

	@Test (priority = 0)
	public void test1() {
		System.out.println("Test test1");
	}
	@Test(priority = -1)
	public void alpha1() {
		System.out.println("Test alpha1");
	}
	@Test(priority = 1)
	public void beta1() {
		System.out.println("Test beta1");
	}
	@Test
	public void alpha() {
		System.out.println("Test alpha");
	}
	@Test
	public void beta() {
		System.out.println("Test beta");
	}
}
