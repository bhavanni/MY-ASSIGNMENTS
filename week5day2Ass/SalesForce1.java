package week5day2Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForce1 extends ProjectSpecificMethod {
	@DataProvider(name="Legal Entity Name")
	public String[][] setValue(){
		String[][] data= {{"Salesforce Automation by Bhavanni"}};
	return data;
	}
	
	@Test(dataProvider ="Legal Entity Name")
	public  void  salesforce1(String data1) throws InterruptedException {
		
	
	WebElement toggleopt = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
	toggleopt.click();
	WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
	viewall.click();
	Thread.sleep(500);
	WebElement legalent = driver.findElement(By.xpath("(//p[@class='slds-truncate'])[81]"));
	Actions opt = new Actions(driver);
	opt.moveToElement(legalent).perform();
	legalent.click();
	Thread.sleep(2000);
	WebElement dropd = driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[6]"));
	dropd.click();
	Thread.sleep(1500);
	
	WebElement entity = driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]"));
	entity.click();

	WebElement lname = driver.findElement(By.xpath("//input[@id='input-148']"));
	lname.sendKeys(data1);
	
	WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
	save.click();
	WebElement e = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
	String web = e.getText();
	System.out.println(web);
}
}
