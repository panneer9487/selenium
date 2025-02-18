package l1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class third {
	
	public static void main(String[] args) {
		
	
		WebDriverManager.edgedriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.name("username")).sendKeys("j2ee");
		
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("j2ee");
		
		driver.findElement(By.name("signon")).click();
		
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[1]/div[1]/a[3]")).click();
		
		driver.findElement(By.linkText("FL-DSH-01")).click();
		
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[2]/td[5]")).click();
		
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		
		driver.findElement(By.name("order.billState")).clear();
		
		driver.findElement(By.name("order.billState")).sendKeys("Welton");
		
		driver.findElement(By.name("newOrder")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/a[1]")).click();
		
		
		
		
}
}