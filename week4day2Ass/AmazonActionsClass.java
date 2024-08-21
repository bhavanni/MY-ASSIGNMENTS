package week4day2Ass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionsClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement element11 = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]"));
		String price = element11.getText();
		System.out.println("1 first : " + price);
		Thread.sleep(500);
		
		WebElement element2 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		String rating = element2.getText();
		System.out.println("first rating is: "+ rating);
		
		
		WebElement firstImage = driver.findElement(By.xpath("(//img[contains(@class, 's-image')])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).click().perform();
        
        Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		System.out.println("child window name : "+driver.getTitle());
        
	   File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshots/img1.png");
		FileUtils.copyFile(scr, dest);	
		
		Thread.sleep(1000);
		 WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
         addToCartButton.click();
         Thread.sleep(500);
         
         WebElement element5 = driver.findElement(By.xpath("//*[@id=\"attach-accessory-cart-subtotal\"]"));
         String text1 = element5.getText();
         System.out.println("cart subtotal: "+text1);
        
         if ((price).equalsIgnoreCase(text1)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are different");
		}
       
         driver.quit();
      
	}

}

