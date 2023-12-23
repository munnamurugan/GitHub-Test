package step.def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Login extends BaseClass{
	
	@Given("User navigate to Orange login page")
	public void user_navigate_to_orange_login_page() {
		
		loaddriver();
		URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	@When("User Enter the valid username and password as {string} and {string}")
	public void user_enter_the_valid_username_and_password_as_and(String Username, String Password) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(Username);
	    driver.findElement(By.name("password")).sendKeys(Password);
	}
	@Then("User Click the login button")
	public void user_click_the_login_button() {
		WebElement elemnt =  driver.findElement(By.xpath("//*[@type=\"submit\"]"));
		elemnt.click();
	}
	@Then("User should be navigate to OrangeHRM Home page")
	public void user_should_be_navigate_to_orange_hrm_home_page() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}




}
