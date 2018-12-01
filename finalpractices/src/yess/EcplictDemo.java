package yess;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;

public class EcplictDemo {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.gecko.driver","D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.209868637.933974610.1543388064-925959462.1543388064");
		
		d.switchTo().frame("login_page");
		
		d.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("369258");
		
	System.out.println(d.findElement(By.xpath("//a[contains(text(),' Forgot Customer ID?')]")).getText());

/* File scr=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(scr, new File("D://hdfc.png"));*/
	
	WebDriver augmentedDriver=new Augmenter().augment(d);
	File screenshot=((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("D://icici.png"));
	
	
	
	}

}
