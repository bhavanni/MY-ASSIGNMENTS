package week2day2Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_companyName\"]")).sendKeys("Test leaf");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstName\"]")).sendKeys("Bhavanni");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_lastName\"]")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("Bhavanni V");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_departmentName\"]")).sendKeys("Selenium with Java");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_description\"]")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("vbhavanni15@gmail.com");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalStateProvinceGeoId\"]"));
		Select dropdown4=new Select(state);
		dropdown4.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_description\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_description\"]")).sendKeys("Selenium With Java");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println("The Title is :" + title);
		driver.close();
		}
		
		
	}


