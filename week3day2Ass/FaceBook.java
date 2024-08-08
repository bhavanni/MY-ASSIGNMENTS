package week3day2Ass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		int size = totalLink.size();
		System.out.println(size);

		String text = totalLink.get(3).getText();
		System.out.println(text);

		
	}

	}
