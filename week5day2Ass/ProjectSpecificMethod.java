package week5day2Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public ChromeOptions option;
	public ChromeDriver driver;
	
	@Parameters({"url","uname","pswd"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) throws InterruptedException {
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(username);		
		driver.findElement(By.id("password")).sendKeys(password);		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);
	}	
	@AfterMethod
	private void postCondition() {
		driver.close();
}
}
