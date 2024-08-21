package week4day2Ass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement men = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions mouse1 = new Actions(driver);
		mouse1.moveToElement(men).perform();
		System.out.println("selected option 1: "+men.getText());
		Thread.sleep(500);
		
		
		WebElement shoe = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
		System.out.println("selected option 2: "+shoe.getText());
		Actions mouse2 = new Actions(driver);
		mouse2.moveToElement(shoe).perform();
		shoe.click();
		Thread.sleep(500);
	
		WebElement scount = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println("Count of the Sport Shoes : "+scount.getText());
		
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();

		WebElement dropdown = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		dropdown.click();
		WebElement lowtoh = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		Actions sortl  = new Actions(driver);
		sortl.moveToElement(lowtoh).perform();
		lowtoh.click();
		Thread.sleep(1000);
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        System.out.println(price.size());
   
        boolean sortedCorrectly = true;
        double previousPrice = 0.0;

        for (WebElement priceElement : price) {
            String priceText = priceElement.getText().replace("Rs. ", "").replace(",", "");
            double currentPrice = Double.parseDouble(priceText);
            if (currentPrice < previousPrice) {
                sortedCorrectly = false;
                break;
            }
            previousPrice = currentPrice;
        }

        if (sortedCorrectly) {
            System.out.println("Items are NOT sorted correctly by price.");
        } else {
            System.out.println("Items are sorted correctly by price.");
        }
        
		
		Thread.sleep(500);
		WebElement value1 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		value1.clear();
		value1.sendKeys("500");
		Thread.sleep(500);
		System.out.println("selected value 1: "+value1.getText());

		WebElement value2 = driver.findElement(By.xpath("//input[@name='toVal']"));
		value2.clear();
		value2.sendKeys("1000");
		Thread.sleep(500);
		System.out.println("selected value 2: "+value2.getText());

		WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
		System.out.println("selected color: "+color.getText());
		color.click();
		Thread.sleep(500);
		
		WebElement shoe1 = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
		Actions mouse3 = new Actions(driver);
		mouse3.moveToElement(shoe1).perform();
		shoe1.click();
		
		Thread.sleep(500);
		WebElement shoeprice = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		String sp = shoeprice.getText();
		System.out.println("shoe price : "+sp);
		
		Thread.sleep(500);
		WebElement shoediscount = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		String sd = shoediscount.getText();
		System.out.println("shoe price : "+sd);
		
		Thread.sleep(500);

		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshots/img3.png");
		FileUtils.copyFile(scr, dest);	
		
		driver.close();
		driver.quit(); 
		
	
	}

}
