package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		WebElement firstn = driver.findElement(By.cssSelector("#input-firstname"));
//		firstn.sendKeys("Darshita");
		firstn.sendKeys(Keys.chord(Keys.SHIFT+"D"));
		firstn.sendKeys(Keys.chord(Keys.chord("arshita")));
//		Thread.sleep(1000);
//		WebElement lastn = driver.findElement(By.cssSelector("#input-lastname"));
//		lastn.sendKeys("Singh");
//		Thread.sleep(1000);
//		WebElement email = driver.findElement(By.cssSelector("#input-email"));
//		email.sendKeys("darshita@123.com");
//		WebElement Tele = driver.findElement(By.cssSelector("#input-telephone"));
//		Tele.sendKeys("12365");
		
//		Tele.sendKeys(Keys.PAGE_DOWN);
		
//		Thread.sleep(1000);
		
//		WebElement pass = driver.findElement(By.cssSelector("#input-password"));
//		pass.sendKeys("Darshita123");
		
//		Thread.sleep(1000);
		
//		WebElement cpass = driver.findElement(By.cssSelector("#input-confirm"));
//		cpass.sendKeys("Darshita123");
	     
//		Thread.sleep(1000);
//		WebElement news = driver.findElement(By.cssSelector(".radio-inline:nth-child(1)"));
//		news.click();
//		System.out.println("After Selected :" + news.isSelected());
	}

}
