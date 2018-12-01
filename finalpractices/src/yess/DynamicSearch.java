package yess;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicSearch {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.google.com/");
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		List<WebElement> list=d.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing"))
			{
				list.get(i).click();
				break;
			}
			
			
			
			
			
		}
	}

}
