package hospital;

import org.testng.annotations.Test;

public class Payment {

	@Test
	public void cc() {
		System.out.println("credit card");
	}

	@Test
	public void DC() {
		System.out.println("debit card");
	}

	@Test
	public void NB() {
		System.out.println("net banking");
	}
	
	@Test(groups = "checkUPI")
	public void UPI() {
		System.out.println("UPI");
	}
	
	

}
