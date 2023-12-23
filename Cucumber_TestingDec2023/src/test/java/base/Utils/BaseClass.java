package base.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	
	public static void loaddriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Murugan\\Selenium driver files\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
public static void URL ( String url) {
		
	driver.navigate().to(url);
		
	}
	public static void sendkeys(WebElement element, String text) {
		
		element.sendKeys(text);
		
	}
	
public static void click (WebElement element) {
		
		element.click();
		
	}
public static void closeBrowser () {
	
	driver.close();
	
}
public static String propertiesFile (String key) throws IOException	{
	
	File file = new File ("C:\\Users\\31mun\\eclipse-workspace\\Cucumber_TestingDec2023\\src\\test\\resources\\Config.properties ");
	FileInputStream fis = new FileInputStream(file);
	Properties properties = new Properties();
	properties.load(fis);
	String pro = properties.getProperty(key);
	return pro;
	
}

}
