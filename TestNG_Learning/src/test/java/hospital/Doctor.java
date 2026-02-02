package hospital;

import org.testng.annotations.Test;

public class Doctor {
	@Test
	public void createAccount() {
		System.out.println("doctor create account");
	}

	@Test
	public void login() {
		System.out.println("doctor login");
	}

	@Test
	public void changePassword() {
		System.out.println("doctor change password");
	}

	@Test
	public void logout() {
		System.out.println("doctor logout");
	}
}
