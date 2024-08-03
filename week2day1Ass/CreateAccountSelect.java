package week2day1Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("BHAVANNI V");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select dropdown=new Select(Industry);
		dropdown.selectByIndex(3);
		
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 =new Select(Ownership);
		dropdown1.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dropdown2=new Select(source);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement  marketingcampaign = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown3=new Select(marketingcampaign);
		dropdown3.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown4=new Select(state);
		dropdown4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	String text = driver.findElement(By.linkText("BHAVANNI V")).getText();
		System.out.println(text);
		if(text.contains("BHAVANNI V"))
			System.out.println("Account Name Created");
			else
			System.out.println("Account Name  Not Created");
			driver.close();
	}
	
		
	}


