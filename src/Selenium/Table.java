package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("San Francisco");
		
		Thread.sleep(5000);
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='example']"));
		System.out.println("Total number :"+table.size());
		
		
	}

}
