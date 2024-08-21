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

public class BigBasketActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement shopbycate = driver.findElement(By.xpath("(//span[text()='Category'])[2]"));
		shopbycate.click();
		Thread.sleep(500);
		WebElement foodgom = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions mouse1 = new Actions(driver);
		mouse1.moveToElement(foodgom).perform();
		Thread.sleep(500);
		WebElement ricenrice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions mouse2 = new Actions(driver);
		mouse2.moveToElement(ricenrice).perform();
		
		WebElement boilnstream = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		boilnstream.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.xpath("//span[text()='Brands']"))).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder=\"Search here\"])[1]")).sendKeys("BB Royal");
		WebElement bbroyal =driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		bbroyal.click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		Thread.sleep(500);
		
		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		
		WebElement kg5 =driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]"));
		Actions kg = new Actions(driver);
		kg.moveToElement(kg5).perform();
		kg5.click();
		
		Thread.sleep(500);
		WebElement price = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[5]"));
		
		System.out.println("Rice Price is : " + price.getText());
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		WebElement totalprice = driver.findElement(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 StickyPdDetail___StyledLabel-sc-1375rlr-5 gJxZPQ dYFNsp\"]"));
		System.out.println("Total Price: "+totalprice.getText());
		Thread.sleep(1000);
		if ((price.getText()).equals(totalprice.getText())) {
			System.out.println("Both are Same Price");
		} else {
			System.out.println("Both are not Same Price");
		}
		Thread.sleep(500);
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshots/img2.png");
		FileUtils.copyFile(scr, dest);	
		
		driver.close();
		driver.quit();

		
	}

}
