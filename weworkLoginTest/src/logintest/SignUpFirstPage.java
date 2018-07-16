package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpFirstPage {
	
private WebDriver driver;
	
	@FindBy(xpath="//input[@id='registration-email']")
	WebElement emailaddress_field;
	
	@FindBy(xpath="//input[@id='registration-password']")
	WebElement pwd_field;
	
	@FindBy(xpath="//input[@id='registration-password-confirm']")
	WebElement confirm_pwd_field;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement letsgo_button;
	
	public SignUpFirstPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void set_emailaddress(String email)
	{
		emailaddress_field.sendKeys(email);
	}
	
	public void set_pwd(String pwd)
	{
		pwd_field.sendKeys(pwd);
	}
	
	public void set_confirm_pwd(String confirm_pwd)
	{
		confirm_pwd_field.sendKeys(confirm_pwd);
	}
	
	public void click_letsGoButton()
	{
		letsgo_button.click();
	}
	

}
