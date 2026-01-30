package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P006_CalcTest {
	
	@Test
	public void addTest() {
		Calc c = new Calc();
		int actual = c.add(12, 34);
		int expected = 46;
		assertEquals(expected, actual);
	}
}
