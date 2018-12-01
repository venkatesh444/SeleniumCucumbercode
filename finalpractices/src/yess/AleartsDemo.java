package yess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AleartsDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.naukri.com/");
		
		Thread.sleep(4000);
		Alert a=d.switchTo().alert();
		/*d.findElement(By.xpath(".//*[@id='geoLocPopUp']"));
		d.findElement(By.xpath(".//*[@id='block']")).click();*/
		
		a.accept();
		
		

	}

}
