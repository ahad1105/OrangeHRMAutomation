package PageEvents;
import org.testng.Assert;
import PageObjects.LoginPageELements;
import utils.ElementFetch;

public class LoginPage {
	
	ElementFetch ele = new ElementFetch();
			
	public void usernameEnter()
	{
		ele.getWebElement("XPATH", LoginPageELements.USERNAME).sendKeys("Admin");
		
	}
	
	public void passwordEnter()
	{
		ele.getWebElement("XPATH", LoginPageELements.Password).sendKeys("admin123");
	}
	
	public void forgotPassword()
	{
		ele.getWebElement("XPATH", LoginPageELements.FORGOTPASSWORD).click();
	}
	
	public void loginButton()
	{
		ele.getWebElement("XPATH", LoginPageELements.LOGIN).click();
	}
	
	public void logintitleValidation()
	{
		ele.getWebElement("XPATH", LoginPageELements.LOGIN).click();
		Assert.assertEquals(ele.getWebElement("XPATH",LoginPageELements.LOGINTITLE).getText(), "Login", "The page does not display the expected Page");
	}
	
}
