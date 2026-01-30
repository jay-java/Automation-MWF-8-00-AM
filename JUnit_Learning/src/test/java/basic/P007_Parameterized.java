package basic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class P007_Parameterized {

	int a;
	int b;
	int expected;

	public P007_Parameterized(int a, int b, int expected) {
		super();
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	
	@Test
	public void addTest() {
		Calc c = new Calc();
		int actualResult = c.add(a, b);
		int expectedResult = expected;
		
		assertEquals(expectedResult, actualResult);
	}
	

	@Parameters
	public static List<Object[]> data() {

		Object obj[][] = new Object[4][3];
		obj[0][0] = 10;
		obj[0][1] = 10;
		obj[0][2] = 20;

		obj[1][0] = 50;
		obj[1][1] = 70;
		obj[1][2] = 120;

		obj[2][0] = 100;
		obj[2][1] = 10;
		obj[2][2] = 110;

		obj[3][0] = 50;
		obj[3][1] = 120;
		obj[3][2] = 120;

		return Arrays.asList(obj);
	}
}
