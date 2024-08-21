package week4day1Ass;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(200);
		WebElement el = driver.findElement(By.xpath("//button[text()='Try it']"));
		el.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Bhavanni");
		alert.accept();
		WebElement el1 = driver.findElement(By.xpath("//p[@id='demo']"));
		String text = "Hello Bhavanni! How are you today?";
		if (el1.getText().equals(text)) {
			System.out.println("Text  verified successfully");
		} else {
			System.out.println("Text  failed");
		}
		driver.close();
	}

}
