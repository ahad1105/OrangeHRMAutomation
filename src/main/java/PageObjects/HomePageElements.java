package PageObjects;

public interface HomePageElements {
	
	String DASHBOARDNAME = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']";
	String ASSIGNLEAVE = "//button[@title='Assign Leave']//*[name()='svg']";
	String LEAVELIST = "//button[@title='Leave List']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='g'][1]";
	String UPGRADE = "//button[normalize-space()='Upgrade']";
	

}
