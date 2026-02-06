package listeners;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
		assertFalse(true);
	}
}
