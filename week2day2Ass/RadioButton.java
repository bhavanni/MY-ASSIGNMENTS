package week2day2Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Select 'Your most favourite browser' 
		 WebElement favouriteBrowserRadioButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
		 favouriteBrowserRadioButton.click();
	        System.out.println("Selected ' most favourite browser  radio button.");
	        Thread.sleep(1000);
		
	//	Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’. 
		
		 WebElement favouriteBrowserRadioButton1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[2]/div/div[2]"));
		 favouriteBrowserRadioButton1.click();															
		 Thread.sleep(2000);											
		 favouriteBrowserRadioButton1.click();														
		 if (favouriteBrowserRadioButton1.isSelected()) {
				System.out.println("Bengaluru is selected");
			} else {
				System.out.println("Bengaluru is not selected");
				
			}
		 
	//	 Identify the radio button that is initially selected by default
		
		 WebElement initiallySelectedRadioButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:2\"]"));
		 if (initiallySelectedRadioButton.isSelected()) {									
		     System.out.println("The initially selected radio button is  identified.");		
		   } else {
			   initiallySelectedRadioButton.click();
		        System.out.println("The initially selected radio button is not identified.");
		    }
		
	//	 Check and select the age group (21-40 Years) if not already selected.
		 
		  WebElement ageGroupRadioButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]"));
		    if (ageGroupRadioButton.isEnabled()) {
		       
		        System.out.println("Selected the age group (21-40 Years).");
		    } else {
		        System.out.println("The age group (21-40 Years) is already selected.");
		        ageGroupRadioButton.click();
		    }
		
		driver.close();
			
	}

}
