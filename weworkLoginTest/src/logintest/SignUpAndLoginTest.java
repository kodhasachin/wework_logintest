package logintest;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpAndLoginTest {
	
public static WebDriver driver;
	
	
	@BeforeClass
	public void openChrome() throws IOException
	{
		try{
			System.setProperty("webdriver.chrome.driver", "/Users/skodha/sachin/softwares/Selenium/chromedriver");
			driver = new ChromeDriver();
		}
		catch(Exception e)
		{
			System.out.println("exception occurred: "+e);
		}
		
		
	}
	
	@BeforeMethod
	public void openURL()
	{
		driver.get("https://app.fieldlens.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test_login()
	{
		Random rand = new Random();
        
		FieldLensLoginPage loginpage = new FieldLensLoginPage(driver);
		SignUpFirstPage signup_firstpage = new SignUpFirstPage(driver);
		SignUpSecondPage signup_secondpage = new SignUpSecondPage(driver);
		SignUpThirdPage signup_thirdpage = new SignUpThirdPage(driver);
		FieldLensHomePage homepage = new FieldLensHomePage(driver);
		
		loginpage.click_SignUpLink();
		
		String email_id = "test_"+rand.nextInt(1000)+"@guerrillamailblock.com";
		System.out.println("User email is:"+email_id);
		
		signup_firstpage.set_emailaddress(email_id);
		signup_firstpage.set_pwd("pass1234");
		signup_firstpage.set_confirm_pwd("pass1234");
		signup_firstpage.click_letsGoButton();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		signup_secondpage.set_firstname("firstname");
		signup_secondpage.set_lastname("lastname");
		signup_secondpage.set_jobtitle("admin");
		signup_secondpage.set_phone("43223454");
		signup_secondpage.click_nextButton();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		homepage.click_getStartedButton();
		
		Assert.assertEquals(homepage.is_DrawingsLink_Displayed(), true);
		Assert.assertEquals(homepage.is_FeedLink_Displayed(), true);
		Assert.assertEquals(homepage.is_PeopleLink_Displayed(), true);
	}
	

	@AfterClass
	public void close()
	{
		driver.quit();
	}


}
