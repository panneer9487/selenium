package l1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class second {

	public static void main(String[] args) {
		WebDriverManager.edgedriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.name("username")).sendKeys("j2ee");
		
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("j2ee");
		
		driver.findElement(By.name("signon")).click();
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.name("account.lastName")).clear();
		driver.findElement(By.name("account.lastName")).sendKeys("XYZ");
		
		driver.findElement(By.name("editAccount")).click();
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		
		
		
		
	
		
	}

}
