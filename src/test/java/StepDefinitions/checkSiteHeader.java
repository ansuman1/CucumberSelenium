package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class checkSiteHeader {

	WebDriver driver;
	
	@Given("^I am in weather application$") 
	public void I_am_in_weather_application() throws InterruptedException
	{
		System.out.println("In Given");
		
		System.setProperty("webdriver.chrome.driver","/Users/mishras/Documents/software/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");
		
	}
	@When("^I am on Home page$")
	public void I_am_on_Home_page() {
		Assert.assertEquals("https://openweathermap.org/", driver.getCurrentUrl());
	}
	@Then("^I can search ([^\\\"]*)$") 
	public void I_can_search_multiple_cities(String arg1) {
		driver.findElement(By.xpath("//div[@class='search-container']/input")).sendKeys(arg1);
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
	//	Assert.assertTrue(driver.findElement(By.));
		driver.close();
	}
}