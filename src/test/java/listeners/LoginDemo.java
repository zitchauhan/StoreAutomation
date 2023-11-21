package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class LoginDemo {
	@Test
	public void loginByEmail() {
System.out.println("login by email");
		Assert.assertEquals("Naseem", "Naseem");
	}

	@Test
	public void loginByFacebook() {
		System.out.println("login by facebook");

		Assert.assertEquals("Naseem", "Banu");
	}
}
