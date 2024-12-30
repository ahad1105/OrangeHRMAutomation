package QA.Test;

import org.testng.annotations.Test;

import base.BaseTest;
import PageEvents.HomePage;

import utils.ElementFetch;




public class QAHomeTest extends BaseTest {
	
	ElementFetch ele = new ElementFetch();
	HomePage home = new HomePage();
	
	
	 @Test
	  public void HomePageTestCase() {
		 logger.info("checking home page upgrade name validation ");
		 home.homepageupgradeValidation();
		 logger.info("Clicking on dashboard homepage button");
		 home.dashboardHomepage();
		 driver.navigate().back();
		 logger.info("Checking leaves of an employee");
		 home.employeeLeaveList();
		 driver.navigate().back();
		 logger.info("assigning leaves to employee");
		 home.employeeAssignLeave();
		 driver.navigate().back();
		 }
	
	
	

}
