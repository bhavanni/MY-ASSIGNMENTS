package week2day1Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("BHAVANNI");
		driver.findElement(By.name("lastname")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("vbhavanni15@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vbhavanni15@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("bhava@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select dropdown =new Select(Day);
		dropdown.selectByVisibleText("15");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(Month);
		dropdown1.selectByIndex(6);
		
		WebElement Year = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(Year);
		dropdown2.selectByValue("1998");
		
	
		WebElement Radio = driver.findElement(By.className("_8esa"));
        Radio.click();
}

		
	}


