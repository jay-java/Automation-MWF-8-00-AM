package hospital;

import org.testng.annotations.Test;

public class Patient {
	@Test
	public void createAccount() {
		System.out.println("patient create account");
	}

	@Test(groups = "checkUPI")
	public void login() {
		
		System.out.println("patient login");
	}

	@Test
	public void changePassword() {
		System.out.println("patient change password");
	}

	@Test
	public void logout() {
		System.out.println("patient logout");
	}
}
