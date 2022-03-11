package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Documents\\Chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
WebElement chbox = driver.findElement(By.xpath("//input[@name='optradio']"));
chbox.click();
System.out.println("After selected : "+chbox.isSelected());

chbox.sendKeys(Keys.PAGE_DOWN);

Thread.sleep(1000);

WebElement chbox1 = driver.findElement(By.xpath("//input[@name='gender']"));
chbox1.click();
System.out.println("After selected : "+chbox1.isSelected());

Thread.sleep(1000);

WebElement chbox2 = driver.findElement(By.xpath("//input[@name='ageGroup']"));
chbox2.click();
System.out.println("After selected : "+chbox2.isSelected());
}

}
