package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQaMainPage {
	
	WebDriver driver;
	
	WebElement elementsTab;
	
	List<WebElement> demoQaTabList;
	
	public DemoQaMainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
public List<WebElement> getDemoQaTabList() {
		
		return driver.findElements(By.className("card mt-4 top-card"));
	}

	public void navigateToElementsTab()  {
		
		getDemoQaTabList().get(1).click();
	}
}
