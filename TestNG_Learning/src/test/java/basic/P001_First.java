package basic;

import org.testng.annotations.Test;

public class P001_First {

	@Test
	public void test1() {
		System.out.println("test 1 method");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("test 2 method");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void test3() {
		int i = 10 / 0;
		System.out.println("test 3 method : " + i);
	}
}
