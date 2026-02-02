package basic;

import org.testng.annotations.Test;

public class P002_Priority {

	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 3)
	public void profile() {
		System.out.println("manage profile");
	}

	@Test(priority = 4)
	public void changePassword() {
		System.out.println("change password");
	}

	@Test(priority = 5)
	public void forgotPassword() {
		System.out.println("forgot password");
	}

	@Test(priority = 6)
	public void logout() {
		System.out.println("logout");
	}
}
