package step.def;

import java.util.List; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_DataTable_List extends BaseClass {
	
	
	@Given("User navigate to orange login page")
	public void user_navigate_to_orange_login_page() {
		loaddriver();
		URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@When("User enter the Valid Username and Password")
	public void user_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List <String> aslist = dataTable.asList();
		String user = aslist.get(0);
		String pass = aslist.get(3);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("password")).sendKeys(pass);
		
	    
	}
	@When("User Click the Login button")
	public void user_click_the_login_button() {
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		login.click();
	}
	@Then("User should be navigate to Home page")
	public void user_should_be_navigate_to_home_page() {
		String title = driver.getTitle();
		System.out.println("Current page Title is =" + title);
	   
	}


	




}
