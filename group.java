package mymavenproject11;

import org.testng.annotations.Test;

public class group {

	//group names can be login, logout, portfolio
	
	@Test(groups= {"login"})
	public void testcase1() {
		System.out.println("Testcase one");
	}
	@Test(groups= {"login"})
	public void testcase2() {
		System.out.println("Testcase 2");
}
	@Test(groups= {"logout"})
	public void testcase3() {
		System.out.println("Testcase 3");	
	}
	
	@Test(groups= {"logout"})
	public void testcase4() {
		System.out.println("Testcase 4");	
	}
	@Test(groups= {"portfolio"})
	public void testcase5() {
		System.out.println("Testcase five");
	}
	@Test(groups= {"portfolio"})
	public void testcase6() {
		System.out.println("Testcase six");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}