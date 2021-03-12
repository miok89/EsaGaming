package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPage {

	WebDriver driver;
	
	WebElement practiseFormBtn;

	public FormsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getPractiseFormBtn() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li"));
	}
	
	public void navigateToPractiseFormBtn() {
		getPractiseFormBtn().click();
	}
}
