package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P004_Annotations {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@AfterMethod
	public void afteMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
