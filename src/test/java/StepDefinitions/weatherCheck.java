package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
//import junit.framework.Assert;

public class weatherCheck {
	WebDriver driver;
//	WebDriverWait wait = new WebDriverWait(driver, 2000);
	
	@Given("^I am in weather site$") 
	public void I_am_in_weather_site() throws InterruptedException
	{
		System.out.println("In Given");
		
		System.setProperty("webdriver.chrome.driver","/Users/mishras/Documents/software/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");
		
	}
	@When("^I search for a City$")
	public void I_search_for_a_City() throws InterruptedException 
	{
		System.out.println("in when");
		driver.findElement(By.xpath("//div[@class='search-container']/input")).sendKeys("Milwaukee County, US");
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//ul[@class='search-dropdown-menu']/li)")).click();
		//WebElement element = wait.until(By.xpath("//div[@class='current-container mobile-padding']/div[1]/h2"));
		
		//Assert.asser
	}
	@Then("I get the temperature of the city")
	public void i_get_the_temperature_of_the_city() {
		System.out.println("In Then");
		String citynm = driver.findElement(By.xpath("//div[@class='current-container mobile-padding']/div[1]/h2")).getText();
		System.out.println("CityName: "+ citynm);
		Boolean visible = driver.findElement(By.cssSelector("span.heading")).isDisplayed();
		Assert.assertEquals("Milwaukee, US", citynm);
		driver.close();
	}

}
