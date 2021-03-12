package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

	WebDriver driver;

	WebElement dynamicPropertiesTab;
	WebElement alertsFramesWindowsTab;
	
	List<WebElement> toolsQaTabList;

	public ElementsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getDynamicPropertiesTab() {
		return driver.findElement(By.id("item-8"));
	}
	
	public void navigateToDynamicPropertiesTab() {	
		getDynamicPropertiesTab().click();
	}
	
	public List<WebElement> getToolsQaTabList() {
		return driver.findElements(By.className("element-group"));
	}

	public void navigateToFormTab()  {
		getToolsQaTabList().get(1).click();
	}
	
	public void navigateToAlertsFramesWindowsTab()  {
		getToolsQaTabList().get(2).click();
	}
	
	public void navigateToInteractionsTab()  {
		getToolsQaTabList().get(4).click();
	}
}
