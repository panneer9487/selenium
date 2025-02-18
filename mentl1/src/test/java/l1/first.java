package l1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver();
		
		WebDriver driver = new EdgeDriver();
		
		System.out.println("Start");
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.linkText("Register Now!")).click();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("admin");
		
		System.out.println("password sended");
		
		driver.findElement(By.name("repeatedPassword")).sendKeys("admin");
		
		driver.findElement(By.name("account.firstName")).sendKeys("Arun");
		
		System.out.println("anothe");
		
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("A");
		
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("arun123@gmail.com");

		driver.findElement(By.xpath("//html/body/div[2]/div[1]/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//*[@name=\"account.address1\"]")).sendKeys("No 38/13 Assayee Road");
		
		driver.findElement(By.xpath("//*[@name=\"account.address2\"]")).sendKeys("Sindhi Colony");
		
		driver.findElement(By.xpath("//*[@name=\"account.city\"]")).sendKeys("Bengaluru");
		
		driver.findElement(By.name("account.state")).sendKeys("Karnataka");
		
		driver.findElement(By.name("account.zip")).sendKeys("560005");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		
		driver.findElement(By.name("account.country")).sendKeys("India");
		
		WebElement w =  driver.findElement(By.xpath("//*[@name='account.languagePreference']"));
		
		Select drop =  new Select(w);
		
		Thread.sleep(2000);
		
		drop.selectByIndex(1);
		
		Thread.sleep(2000);
		

		driver.findElement(By.name("account.listOption")).click();
		
		driver.findElement(By.name("account.bannerOption")).click();

		driver.findElement(By.name("newAccount")).click();
		
		
		}

}
