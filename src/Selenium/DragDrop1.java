package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement firstn = driver.findElement(By.xpath("//p[contains(text(),'Drag me')]"));
		WebElement secd = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		Thread.sleep(4000);
		a.dragAndDrop(firstn, secd).build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		
		WebElement firstn1 = driver.findElement(By.xpath("//h5[text()='Mr John']"));
		WebElement secd1 = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		
		a.dragAndDrop(firstn1, secd1).build().perform();
//		driver.navigate().refresh();
		
		
//		WebElement firstn2 = driver.findElement(By.xpath("//h5[text()='Mary']"));
//		WebElement secd2 = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		
//		a.dragAndDrop(firstn2, secd2).build().perform();
//	    Thread.sleep(2000);
	    driver.quit();
		
	}

}
