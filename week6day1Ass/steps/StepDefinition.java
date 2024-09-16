package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public ChromeOptions option;
	public ChromeDriver driver;
	
	@Given("login the Salesforce page")
	public void login_the_salesforce_page() {
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("Login with valid credentials")
	public void login_with_valid_credentials() {
		driver.findElement(By.id("username")).sendKeys("vinothkumar@testleaf.com");
	     driver.findElement(By.id("password")).sendKeys("SeleniumChallenge@24");
	     driver.findElement(By.id("Login")).click();
	}
	@When("Click on the toggle menu button")
	public void click_on_the_toggle_menu_button() {
		 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	}
	@When("Click view All and select Sales from App Launcher")
	public void click_view_all_and_select_sales_from_app_launcher() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@When("Navigate to the Accounts tab")
	public void navigate_to_the_accounts_tab() {
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[5]")).click();

	}
	@When("Click on the New button")
	public void click_on_the_new_button() {
		WebElement newbut = driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class=\"slds-dropdown__item\"])[1]"));
		newbut.click();
	}
	@When("Enter {string} as account name")
	public void enter_as_account_name(String name) {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys(name);

	}
	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		WebElement owner = driver.findElement(By.xpath("(//button[@class=\"slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value\"])[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", owner);
		owner.click();
		
		driver.findElement(By.xpath("//span[text()='Public']")).click();	
	}
	@Then("Save the account and verify the account name")
	public void save_the_account_and_verify_the_account_name() throws InterruptedException {
		WebElement verify = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]"));
		verify.click();
		Thread.sleep(2000);
//		 String title = driver.getTitle();
//		    if(title.contains("Bhavanni")) 
		String  s1 = driver.findElement(By.xpath("//lightning-formatted-text[text()='Bhavanni']")).getText();
		
		if(s1.equalsIgnoreCase("Bhavanni")){
		    	System.out.println("Account is Vertified");
		    }else {
				System.out.println("Account is not Vertified");
			}
		    
	}
}
