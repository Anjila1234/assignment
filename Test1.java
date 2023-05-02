package mymavenproject11;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

@Test
public static void login() {
	System.out.println("login one");
}

@BeforeMethod	
public void beforemethod() {
	System.out.println("before pass");
}
@AfterMethod
public void aftermethod() {
	System.out.println("after pass");
}
@Test
public void login1() {
	System.out.println("login two");
}
}
