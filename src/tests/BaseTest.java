package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AlertsFramesWindowsPage;
import pages.DemoQaMainPage;
import pages.DynamicPropertiesPage;
import pages.ElementsPage;
import pages.FormsPage;
import pages.InteractionsPage;
import pages.PractiseFormPage;
import pages.SortablePage;

public class BaseTest {
	
	WebDriver driver;

	//pages:
	DemoQaMainPage demoQaMainPage;
	DynamicPropertiesPage dynamicPropertiesPage;
	ElementsPage elementsPage;
	FormsPage formsPage;
	PractiseFormPage practiseFormPage;
	AlertsFramesWindowsPage alertsFramesWindowsPage;
	InteractionsPage interactionPage;
	SortablePage sortablePage;
	
	ExcelReader excelReader;
	
	//variables:
	String firstName;
	String lastName;
	String email;
	String mobile;
	String subjectName;
	String currentAddress;
	String state;
	String city;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
		
		this.demoQaMainPage = new DemoQaMainPage(driver);
		this.dynamicPropertiesPage = new DynamicPropertiesPage(driver);
		this.elementsPage = new ElementsPage(driver);
		this.formsPage = new FormsPage(driver);
		this.practiseFormPage = new PractiseFormPage(driver);
		this.alertsFramesWindowsPage = new AlertsFramesWindowsPage(driver);
		this.interactionPage = new InteractionsPage(driver);
		this.sortablePage = new SortablePage(driver);

		this.excelReader = new ExcelReader("data/TestPlanESA.xlsx");

		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
		System.out.println("The end");
	}

}
