package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsDashboardPage {
	@FindBy(xpath="//span[.='New Report']")
	private WebElement new_report;
	@FindBy(id="configureReportParametersButton")
	private WebElement configure_report_parameters;
	@FindBy(xpath="button[.='Days']")
	private WebElement days;
	@FindBy(id="ext-gen98")
	private WebElement customers;
	@FindBy(id="//span[.='All Staff']")
	private WebElement all_staff;
	
	
	

}
