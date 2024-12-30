package QA.Test;

import org.testng.annotations.Test;

import PageEvents.LoginPage;
import base.BaseTest;
import utils.ElementFetch;

public class QALoginTest extends BaseTest {
	ElementFetch ele = new ElementFetch();
	LoginPage login = new LoginPage();
	
	 @Test
	  public void LoginPageTestCase() throws InterruptedException {
		 logger.info("Checking we have navigated to correct login page or not");
		 login.logintitleValidation();
		 logger.info("Entering username");
		 login.usernameEnter();
		 logger.info("Entering password");
		 login.passwordEnter();
		 //logger.info("clicking on forgot password button ");
		 //login.forgotPassword();
		 logger.info("clicking login button");
		 login.loginButton();
		 
		 
		 }
}
