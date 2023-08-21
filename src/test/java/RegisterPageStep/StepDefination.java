package RegisterPageStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	
	@Given("user is on register page")
	public void user_is_on_register_page() 
	{
	   driver= new ChromeDriver(); 
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   driver.get("https://www.facebook.com/reg");
	}
	
	@When("capture title of register page")
	public void capture_title_of_register_page() 
	{
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	@Then("enter firstname and lastname and email and password")
	public void enter_firstname_and_lastname_and_email_and_password()
	{
	    driver.findElement(By.name("firstname")).sendKeys("Shukla");
	    driver.findElement(By.name("lastname")).sendKeys("Kale");
	    driver.findElement(By.name("reg_email__")).sendKeys("Shukla@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Shukla@123");
	}


}
