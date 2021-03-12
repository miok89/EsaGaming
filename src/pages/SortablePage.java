package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortablePage {
	
	WebDriver driver;
	
	WebElement gridTab;

	public SortablePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getGridTab() {
		return driver.findElement(By.id("demo-tab-grid"));
	}
	
	public void navigateToGridTab() {
		getGridTab().click();
	}
}
