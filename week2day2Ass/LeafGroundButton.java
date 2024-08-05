package week2day2Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://leafground.com/button.xhtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span")).click();
			String title=driver.getTitle();
			System.out.println("The Title is :" + title);
			driver.navigate().back();
			
			WebElement en1= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]"));
			if (en1.isEnabled()) {
			      System.out.println("box is Enabled ");
			       } else {
			          System.out.println("box is Disabled");
			       }
			
			WebElement positionbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
			String text = positionbutton.getText();
	 		  System.out.println("Print the Find the position of the  button : " + text);
	 		 System.out.println(positionbutton.getLocation());
	 		
	 		 WebElement colorbutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]"));
	 		String text1 = colorbutton.getText();
	 		  System.out.println("Print the background color of the  button : "+text1 );
	 		System.out.println(colorbutton.getCssValue("background-color"));
	 		
	 		WebElement heightbutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
	 		String text2 = heightbutton.getText();
	 		  System.out.println("Print the height and width of the  button : "+text2 );
	 		System.out.println(heightbutton.getSize());
	
	    	driver.close();	
	}	
}
