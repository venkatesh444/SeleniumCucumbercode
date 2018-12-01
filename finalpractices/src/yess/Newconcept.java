package yess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Newconcept {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		//WebDriver d=new FirefoxDriver();
		
		WebDriver d=new HtmlUnitDriver();
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		d.get("https://www.freecrm.com");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("venke444");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("venkat444");
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(d.getTitle());
		/*d.findElement(By.xpath("")).clear();
		
		

		d.quit();*/
		
	}

}
