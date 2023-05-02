package mymavenproject11;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
//annotations
	@Test
	public void testcase1() {
		System.out.println("Testcase one");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testcase two");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Testcase three");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Testcase before test");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("Testcase after test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Testcase before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Testcase sfter suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Testcase before class");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("Testcase after class");
	}
}
