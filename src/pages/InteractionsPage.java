package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractionsPage {
	
	WebDriver driver;
	
	WebElement sortableTab;

	public InteractionsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getSortableTab() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[2]/span"));
	}
	
	public void navigateToSortableTab() {
		getSortableTab().click();
	}
}
