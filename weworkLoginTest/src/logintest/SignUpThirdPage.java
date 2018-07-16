package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpThirdPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='registration-company-name']")
	WebElement company_name_field;
	
//	@FindBy(xpath="//select[@id='registration-company-type']")
//	WebElement company_type_dropdown;
//	
//	@FindBy(xpath="//select[@id='registration-discipline-id']")
//	WebElement company_discipline_dropdown;
	
	Select get_company_type_dd(WebDriver driver)
	{
		Select dd = new Select(driver.findElement(By.xpath("//select[@id='registration-company-type']")));
		return dd;
	}
	
	Select get_company_discipline_dd(WebDriver driver)
	{
		Select dd = new Select(driver.findElement(By.xpath("//select[@id='registration-discipline-id']")));
		return dd;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement letsgo_button;
	
	public SignUpThirdPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void set_company_name(String company_name)
	{
		company_name_field.sendKeys(company_name);
	}
	
	public void set_company_type_byValue(String value)
	{
		if(get_company_type_dd(driver)==null)
			System.out.println("Dropdown not found");
		else
			
			get_company_type_dd(driver).selectByVisibleText(value);
			
		
	}
	
	public void set_company_type_byIndex(int index)
	{
		if(get_company_type_dd(driver)==null)
			System.out.println("Dropdown not found");
		else
			((Select) get_company_type_dd(driver)).selectByIndex(index);
	}
	
	public void set_company_discipline_byValue(String value)
	{
		get_company_discipline_dd(driver).selectByVisibleText(value);
	}
	
	public void set_company_discipline_byIndex(int index)
	{
		get_company_discipline_dd(driver).selectByIndex(index);
	}
	
	public void click_letsGoButton()
	{
		letsgo_button.click();
	}
	

}
