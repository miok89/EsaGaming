package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsFramesWindowsPage {

	WebDriver driver;
	
	WebElement nestedFramesTab;

	public AlertsFramesWindowsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getNestedFramesTab() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[4]/span"));
	}
	
	public void navigateToNestedFramesTab() {
		getNestedFramesTab().click();
	}
	
	public WebElement getFrame() {
		return driver.findElement(By.id("frame1Wrapper"));
		
	}
}
