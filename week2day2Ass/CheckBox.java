package week2day2Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		 
		 
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();      //click basic checkbox
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]")).click();                   //click notification checkbox
		driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]")).click();  //click fav lang.
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();              //click tri state
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]")).click();                  //click toggle
		
		WebElement disabledCheckbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102_input\"]"));
		if (disabledCheckbox.isEnabled()) {
		      System.out.println("Checkbox is Enabled ");
		       } else {
		          System.out.println("Checkbox is Disabled");
		       }
		
		WebElement message = driver.findElement(By.xpath("//*[@id='j_idt87:id_container']")); 
			String actualMessage = message.getText();
				System.out.println(actualMessage);
		
		driver.findElement(By.xpath("//div[@class=\"ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right\"]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
			
		driver.close();	
}	
		
	}

	
	
