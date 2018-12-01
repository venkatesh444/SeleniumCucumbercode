package yess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTabledemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.freecrm.com");
		d.findElement(By.xpath("//input[@name='username']")).clear();
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("venke444");
		d.findElement(By.xpath("//input[@name='password']")).clear();
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("venkat444");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		d.switchTo().frame("mainpanel");
		
		//Actions a=new Actions(d);
		
		//a.moveToElement(d.findElement(By.xpath("//a[contains(@title,'Contacts')]"))).build().perform();
		
		//d.findElement(By.xpath("//a[contains(@title,'New Contact')]")).click();
		
		d.findElement(By.xpath("//a[contains(@title,'Contacts')]")).click();
		
		d.findElement(By.xpath("//a[contains(text(),'amma loya')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		d.findElement(By.xpath("//a[contains(text(),'anjani loya')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		
		
		

	}

}
