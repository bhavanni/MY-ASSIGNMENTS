package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pvrcinema {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");


		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		
	
		
		WebElement location = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/form/div/div[2]/span[2]"));
		driver.executeScript("arguments[0].click();",location );
		Thread.sleep(2000);
		
		
		WebElement selcinema = driver.findElement(By.xpath("//*[@id=\"cinema\"]/span"));
		driver.executeScript("arguments[0].click();",selcinema );
		Thread.sleep(2000);
		
		
		
		WebElement selcinema1 = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]"));
		driver.executeScript("arguments[0].click();",selcinema1 );
		Thread.sleep(2000);
		
		
		
		WebElement seldate = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/span"));
		driver.executeScript("arguments[0].click();",seldate );
		Thread.sleep(2000);
		
		
		WebElement selmov = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]"));
		driver.executeScript("arguments[0].click();",selmov );
		Thread.sleep(2000);
		
		
		WebElement seltime = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/span"));
		driver.executeScript("arguments[0].click();",seltime );
		Thread.sleep(2000);
		
		
		WebElement bookbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/form/div/div[7]/button/span"));
		driver.executeScript("arguments[0].click();",bookbutton );
		Thread.sleep(2000);
		
		
		WebElement acceptbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/button[2]"));
		driver.executeScript("arguments[0].click();",acceptbutton );
		Thread.sleep(2000);
		
		
				WebElement selseat = driver.findElement(By.xpath("//*[@id=\"CL.CLUB|I:1\"]"));

		driver.executeScript("arguments[0].click();",selseat );
		Thread.sleep(2000);
		
		
		WebElement proccedbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[6]/div/div[2]/button"));
		driver.executeScript("arguments[0].click();",proccedbutton );
		Thread.sleep(2000);
		
		WebElement mvname = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[3]/div/div[3]/div[2]/h5"));
		String text = mvname.getText();
		System.out.println("MOVIE NAME: " + text);
		
		        
		WebElement mvdatetime = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[3]/div/div[3]/div[2]/p[2]"));
		String text1 = mvdatetime.getText();
		System.out.println("MOVIE DATE AND TIME: " + text1);
		
		            
		
		WebElement mvvenue = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[3]/div/div[3]/div[2]/p[1]"));
		String text2 = mvvenue.getText();
		System.out.println("MOVIE VENUE: " + text2);
		
		
		WebElement grandtotal = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[3]/div/div[7]/div/div/div[1]/h6[2]/span"));
		String text3 = grandtotal.getText();
		System.out.println("GRAND TOTAL OF AMOUNT: " + text3);
		
		
		WebElement finalproceedbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[3]/div/div[7]/div/div/div[2]/button"));
		driver.executeScript("arguments[0].click();",finalproceedbutton );
		Thread.sleep(2000);
		
	
		WebElement popupclose = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/div[2]/div/div[1]/span/i"));
		driver.executeScript("arguments[0].click();",popupclose );
		Thread.sleep(2000);
		
		//title of the page
				String title = driver.getTitle();
				System.out.println("THE PAPGE TITLLE:" +title);
		
		
		
	//	String currentUrl = driver.getCurrentUrl();
	//	System.out.println("THE CURRENT URL: "+currentUrl);
		
		driver.close();
	
	}
}
