package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSecondPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='registration-first-name']")
	WebElement firstname_field;
	
	@FindBy(xpath="//input[@id='registration-last-name']")
	WebElement lastname_field;
	
	@FindBy(xpath="//input[@id='registration-phone']")
	WebElement phone_field;
	
	@FindBy(xpath="//input[@id='registration-job-title']")
	WebElement jobtitle_field;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement next_button;
	
	public SignUpSecondPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void set_firstname(String firstname)
	{
		firstname_field.sendKeys(firstname);
	}
	
	public void set_lastname(String lastname)
	{
		lastname_field.sendKeys(lastname);
	}
	
	public void set_phone(String phone)
	{
		phone_field.sendKeys(phone);
	}
	
	public void set_jobtitle(String job_title)
	{
		jobtitle_field.sendKeys(job_title);
	}
	
	public void click_nextButton()
	{
		next_button.click();
	}

}
