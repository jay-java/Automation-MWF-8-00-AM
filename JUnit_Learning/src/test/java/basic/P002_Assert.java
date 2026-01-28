package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P002_Assert {

	@Test
	public void test1() {
		System.out.println("test 1 method");
	}

	@Test
	public void test2() {
//		System.out.println("test 2 method");
//		int a = 10, b = 2;
//		int actual = a/b;
//		int expected = 6;
//		
//		assertEquals(expected, actual);

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4, 5 };

//		assertArrayEquals(b, a);
//		assertTrue(false);
		
		assertFalse(true);
		
	}

}
