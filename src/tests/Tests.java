package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest{
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/elements");
	}
	
	@Test (priority = 0)
	public void ClicOnButtonsInDynamicProperties() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", elementsPage.getDynamicPropertiesTab());
		Thread.sleep(1000);
		
		elementsPage.navigateToDynamicPropertiesTab();
		Thread.sleep(1000);
		
		dynamicPropertiesPage.navigateToWillEnableBtn();
		Thread.sleep(1000);
		
		dynamicPropertiesPage.navigateToColorChangeBtn();
		Thread.sleep(1000);
		
		dynamicPropertiesPage.navigateToVisibleAfterBtn();
		Thread.sleep(1000);
		
		assertEquals(dynamicPropertiesPage.getColorChangeBtn().isDisplayed(), true);
		assertEquals(dynamicPropertiesPage.getVisibleAfterBtn().isDisplayed(), true);
		Thread.sleep(1000);
	
		}
	
	@Test (priority = 5)
	public void SuccessfullyRegisterOnStudentRegistrationForm() throws InterruptedException {
		
		firstName = excelReader.getData("Practise Form", 6, 5);
		lastName = excelReader.getData("Practise Form", 7, 5);
		email = excelReader.getData("Practise Form", 8, 5);
		mobile = excelReader.getData("Practise Form", 10, 5);
		subjectName = excelReader.getData("Practise Form", 17, 5);
		currentAddress = excelReader.getData("Practise Form", 24, 5);
		state = excelReader.getData("Practise Form", 26, 5);
		city = excelReader.getData("Practise Form", 28, 5);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", elementsPage.getToolsQaTabList().get(1));
		Thread.sleep(1000);
		
		elementsPage.navigateToFormTab();
		Thread.sleep(1000);
		
		formsPage.navigateToPractiseFormBtn();
		Thread.sleep(1000);
		
		practiseFormPage.fillOutStudentRegistrationForm(firstName, lastName, email, mobile, subjectName, currentAddress,
				state, city);
		
		excelReader.assertMethod("Practise Form", 2, 10, practiseFormPage.getCloseBtn().getText());
		Thread.sleep(1000);
		
		practiseFormPage.navigateToCloseBtn();
		Thread.sleep(1000);
	}
	
	@Test (priority = 10)
	public void SuccessfulyOpenNestedFrames() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", elementsPage.getToolsQaTabList().get(2));
		Thread.sleep(1000);
		
		elementsPage.navigateToAlertsFramesWindowsTab();
		Thread.sleep(1000);
		
		alertsFramesWindowsPage.navigateToNestedFramesTab();
		Thread.sleep(1000);
		
		assertEquals(alertsFramesWindowsPage.getFrame().isDisplayed(), true);
		Thread.sleep(1000);
	}
	
	@Test (priority = 15)
	public void SuccessfulyOpenSortableGrid() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", elementsPage.getToolsQaTabList().get(4));
		Thread.sleep(1000);
		
		elementsPage.navigateToInteractionsTab();
		Thread.sleep(1000);
		
		interactionPage.navigateToSortableTab();
		Thread.sleep(1000);
		
		sortablePage.navigateToGridTab();
		Thread.sleep(1000);
		
		assertEquals(sortablePage.getGrid().isDisplayed(), true);
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();	
	}
}
