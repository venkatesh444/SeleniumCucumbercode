package yess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("http://demo.guru99.com/test/delete_customer.php");
		d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("25698");
		d.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert a=d.switchTo().alert();
		
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(5000);
Alert a2=d.switchTo().alert();
		a2.accept();
		Thread.sleep(2000);
		System.out.println(a.getText());
	
		

	}

}
