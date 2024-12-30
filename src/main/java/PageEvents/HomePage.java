package PageEvents;

import org.testng.Assert;

import PageObjects.HomePageElements;
import base.BaseTest;
import utils.ElementFetch;

public class HomePage extends BaseTest {
	
	
		ElementFetch ele = new ElementFetch();
		public void dashboardHomepage()
		{
			ele.getWebElement("XPATH", HomePageElements.DASHBOARDNAME).click();
			
			
		}
		
		public void employeeAssignLeave()
		{
			ele.getWebElement("XPATH", HomePageElements.ASSIGNLEAVE).click();
			

		}
		
		public void homepageupgradeValidation()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			ele.getWebElement("XPATH", HomePageElements.UPGRADE).click();
			Assert.assertEquals(ele.getWebElement("XPATH", HomePageElements.UPGRADE).getText(), "Upgrade", "The page does not display the expected Page");
		}
		
		public void employeeLeaveList()
		{
			ele.getWebElement("XPATH", HomePageElements.LEAVELIST).click();
			
		}
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	


