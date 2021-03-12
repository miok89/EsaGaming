package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicPropertiesPage {

	WebDriver driver;
	
	WebElement willEnableBtn;
	WebElement colorChangeBtn;
	WebElement visibleAfterBtn;
	
	public DynamicPropertiesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getWillEnableBtn() {

		return driver.findElement(By.id("enableAfter"));
	}
	
	public void navigateToWillEnableBtn() {
		
		getWillEnableBtn().click();
	}
	
	public WebElement getColorChangeBtn() {

		return driver.findElement(By.id("colorChange"));
	}
	
	public void navigateToColorChangeBtn(){
		
		getColorChangeBtn().click();
	}
	
	public WebElement getVisibleAfterBtn() {

		return driver.findElement(By.id("visibleAfter"));
	}
	
	public void navigateToVisibleAfterBtn() {
		
		getVisibleAfterBtn().click();
	}
}
