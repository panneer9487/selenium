package l1;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class four {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.name("username")).sendKeys("j2ee");
		
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("j2ee");
		
		driver.findElement(By.name("signon")).click();
		
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[1]/div[1]/a[2]")).click();
		
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[4]/td[1]")).click();
		
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[3]/td[1]")).click();
		
		driver.findElement(By.linkText("Add to Cart")).click();
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		
	}

}
