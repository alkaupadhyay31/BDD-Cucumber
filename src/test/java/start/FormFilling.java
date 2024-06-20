package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormFilling {
	WebDriver driver;
	
	@Given("Open chrome browser and enter link it will open the form page")
	public void open_chrome_browser_and_enter_link_it_will_open_the_form_page() {
		    driver = new ChromeDriver();
			driver.get("https://v1.training-support.net/selenium/simple-form");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("Fill firstName, lastName, Email, Contact")
	public void fill_first_name_last_name_email_contact() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Alka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Upadhyay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alkaupadhyay454@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9148235976");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@rows='2']")).sendKeys("Hii how are you");
		Thread.sleep(2000);
	    
	}

	@When("Click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000);   
	}

	@Then("Thanku alert should be displayed")
	public void thanku_alert_should_be_displayed() {
		
        driver.switchTo().alert().accept();
		
		System.out.println("Test case passed - Thanku alert displayed");
		driver.close();
	    
	}


}
