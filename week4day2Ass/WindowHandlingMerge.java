package week4day2Ass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingMerge {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		 	Set<String> windows = driver.getWindowHandles();
			List<String> list = new ArrayList<String>(windows);
			driver.switchTo().window(list.get(1));
			
			WebElement Contact1 = driver.findElement(By.xpath("//a[text()='DemoCustomer']"));
			Contact1.click();
			driver.switchTo().window(list.get(0));
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			
			Set<String> windows1 = driver.getWindowHandles();
			List<String> list1 = new ArrayList<String>(windows1);
			driver.switchTo().window(list1.get(1));
			
			WebElement Contact2 = driver.findElement(By.xpath("//a[text()='dp1a1contact2']"));
			Contact2.click();
			driver.switchTo().window(list.get(0));
			
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(200);	
			System.out.println(" Title  : "+driver.getTitle());
			
			driver.close();
			driver.quit();
	}

}
