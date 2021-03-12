package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PractiseFormPage {

	WebDriver driver;
	
	WebElement firstNameLbl;
	WebElement lastNameLbl;
	WebElement emailLbl;
	WebElement maleRadioBtn;
	WebElement mobileLbl;
	WebElement dateOfBirthLbl;
	WebElement monthDropDown;
	WebElement yearDropDown;
	WebElement dayOfBirthBtn;
	WebElement subjectsLbl;
	WebElement sportsRadioBtn;
	WebElement readingRadioBtn;
	WebElement musicRadioBtn;
	WebElement selectPictureBtn;
	WebElement currentAddressTextBox;
	WebElement selectStateDropDown;
	WebElement selectCityDropDown;
	WebElement submitBtn;
	WebElement closeBtn;
	
	public PractiseFormPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getFirstNameLbl() {
		return driver.findElement(By.id("firstName"));
	}
	
	public WebElement getLastNameLbl() {
		return driver.findElement(By.id("lastName"));
	}
	
	public WebElement getEmailLbl() {
		return driver.findElement(By.id("userEmail"));
	}
	
	//custom x.path:
	//label[@for="gender-radio-1"]
	public WebElement getMaleRadioBtn() {
		return driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]"));
	}
	
	public void navigateToMaleRadioBtn() {	
		getMaleRadioBtn().click();
	}
	
	public WebElement getMobileLbl() {
		return driver.findElement(By.id("userNumber"));
	}
	
	public WebElement getDateOfBirthLbl() {
		return driver.findElement(By.id("dateOfBirthInput"));
	}
	
	public void navigateToDateOfBirthLbl() {	
		getDateOfBirthLbl().click();
	}
	
	public void navigateToMonthDropDown() {	
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("January");
	}
	
	public void navigateToYearDropDown() {	
		Select month = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		month.selectByVisibleText("1980");
	}
	
	//custom x.path:
	//div[@aria-label="Choose Saturday, January 12th, 1980"]
	public WebElement getDayOfBirth() {
		return driver.findElement(By.xpath("//div[@aria-label=\"Choose Saturday, January 12th, 1980\"]"));
	}
	
	public void navigateToDayOfBirth() {	
		getDayOfBirth().click();
	}
	
	public WebElement getSubjectsLbl() {
		return driver.findElement(By.id("subjectsInput"));
	}
	
	//custom x.path:
	//label[@for="hobbies-checkbox-1"]
	public WebElement getSportsRadioBtn() {
		return driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]"));
	}
	
	public void navigateToSportsRadioBtn() {	
		getSportsRadioBtn().click();
	}
	
	//custom x.path:
	//label[@for="hobbies-checkbox-1"]
	public WebElement getReadingRadioBtn() {
		return driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-2\"]"));
	}
	
	public void navigateToReadingRadioBtn() {	
		getReadingRadioBtn().click();
	}
	
	//custom x.path:
	//label[@for="hobbies-checkbox-1"]
	public WebElement getMusicRadioBtn() {
		return driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]"));
	}
	
	public void navigateToMusicRadioBtn() {	
		getMusicRadioBtn().click();
	}
	
	public WebElement getSelectPictureBtn() {
		return driver.findElement(By.id("uploadPicture"));
	}
	
	public void navigateToSelectPictureBtn() {	
		getSelectPictureBtn().sendKeys("C:\\Users\\ZGOP\\eclipse-kursJava\\EsaGamingTask\\data\\future car.jpg");
	}
	
	public WebElement getCurrentAddressTextBox() {
		return driver.findElement(By.id("currentAddress"));
	}
	
	//custom x.path:
	//input[@id="react-select-3-input"]
	public WebElement getSelectStateDropDown() {
		return driver.findElement(By.xpath("//input[@id=\"react-select-3-input\"]"));
	}
	
	//custom x.path:
	//input[@id="react-select-4-input"]
	public WebElement getSelectCityDropDown() {
		return driver.findElement(By.xpath("//input[@id=\"react-select-4-input\"]"));
	}
	
	public WebElement getSubmitBtn() {
		return driver.findElement(By.id("submit"));
	}
	
	public void navigateToSubmitBtn() {	
		getSubmitBtn().click();
	}
	
	public WebElement getCloseBtn() {
		return driver.findElement(By.id("closeLargeModal"));
	}
	
	public void navigateToCloseBtn() {	
		getCloseBtn().click();
	}
	
	public void fillOutStudentRegistrationForm(String firstName, String lastName,
			String email, String mobile, String subjectName, String currentAddress,
			String state, String city) throws InterruptedException {
		
		getFirstNameLbl().sendKeys(firstName);
		Thread.sleep(1000);
		
		getLastNameLbl().sendKeys(lastName);
		Thread.sleep(1000);
		
		getEmailLbl().sendKeys(email);
		Thread.sleep(1000);
		
		navigateToMaleRadioBtn();
		Thread.sleep(1000);
		
		getMobileLbl().sendKeys(mobile);
		Thread.sleep(1000);
		
		navigateToDateOfBirthLbl();
		Thread.sleep(1000);
		
		navigateToMonthDropDown();
		Thread.sleep(1000);
		
		navigateToYearDropDown();
		Thread.sleep(1000);
		
		navigateToDayOfBirth();
		Thread.sleep(1000);
		
		getSubjectsLbl().click();
		Thread.sleep(1000);
		
		getSubjectsLbl().sendKeys(subjectName);
		getSubjectsLbl().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		navigateToSportsRadioBtn();
		
		navigateToReadingRadioBtn();
		
		navigateToMusicRadioBtn();
	
		navigateToSelectPictureBtn();
		Thread.sleep(1000);
		
		getCurrentAddressTextBox().sendKeys(currentAddress);
		Thread.sleep(1000);
		
		getSelectStateDropDown().sendKeys(state);
		getSelectStateDropDown().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		getSelectCityDropDown().sendKeys(city);
		getSelectCityDropDown().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		navigateToSubmitBtn();
		Thread.sleep(1000);
		
	}
}
