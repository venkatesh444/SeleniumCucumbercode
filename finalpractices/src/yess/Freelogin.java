package yess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Freelogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.freecrm.com");

		String admincredentails = Data.getuserdata().get("admin");
		String admininfo[] = admincredentails.split("_");

		d.findElement(By.xpath("//input[@name='username']")).clear();
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(admininfo[0]);
		d.findElement(By.xpath("//input[@name='password']")).clear();
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(admininfo[1]);

		WebElement loginbtn = d.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click();", loginbtn);

	}

}
