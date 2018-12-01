package yess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

public class DynamicCalendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("https://book.spicejet.com/Search.aspx#");
		
		
		
	}
	
	
	public void selectdatebyjs(WebDriver driver,WebElement element,String date)
	{
		
		JavaScriptExecutor js=((JavaScriptExecutor) driver);
	   /// js.executeScript()
		
	}

}
