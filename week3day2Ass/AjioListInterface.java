package week3day2Ass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//*[@id='appContainer']/div[1]/div/header/div[3]/div[2]/form/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[1]/div/div/div[2]/ul/li[2]/div/div/label")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[2]/div/div/div[2]/ul/li[2]/div/div/label")).click();
		Thread.sleep(600);
		
		WebElement itemf = driver.findElement(By.xpath("//*[@id=\"products\"]/div[3]/div/div[1]/strong"));
		String t1=itemf.getText();
		System.out.println("Items Found: " +t1);
		Thread.sleep(500);
		
		List<WebElement> brandname = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("List of Brand of the Products displayed in the page:  " + brandname.size());
		Thread.sleep(500);
			for (int i = 0; i < brandname.size(); i++) {
				System.out.println("Brand Names: " + brandname.get(i).getText());
					}
	
	
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("List of Names of the Bags displayed in the page :  " +bagname.size());
		Thread.sleep(500);
			for (int i = 0; i < bagname.size(); i++) {
				System.out.println("Bag Names: " + bagname.get(i).getText());
					}
	}					
}
