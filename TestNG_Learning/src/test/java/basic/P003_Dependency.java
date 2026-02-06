package basic;

import org.testng.annotations.Test;

public class P003_Dependency {

	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create acccount");
	}

	@Test(priority = 2)
	public void login() {
		int i = 10  / 0;
		System.out.println("login : ");
	}

	@Test(priority = 3, dependsOnMethods = "login")
	public void profileManage() {
		System.out.println("profile manage");
	}
}
