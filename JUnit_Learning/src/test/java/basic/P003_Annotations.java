package basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P003_Annotations {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Before
	public void before() {
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

	@After
	public void after() {
		System.out.println("after");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
