import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
WebElement ele =  driver.findElement(By.xpath("//input[@class='Pke_EE']"));
/*Thread.sleep(4000);
Actions action = new Actions(driver);
action.sendKeys(ele, "iphone14")
.sendKeys(Keys.ENTER)
.build()
.perform();*/
ele.sendKeys("iphone14");
ele.sendKeys(Keys.RETURN);
	
try {
    Thread.sleep(5000);
} catch (InterruptedException e) {
    e.printStackTrace();
} finally {
    // Close the browser
   
}

driver.findElement(By.xpath(".//*[contains(text(),'APPLE iPhone 14 (Blue, 128 GB)')]")).click();


 
JavascriptExecutor js = (JavascriptExecutor) driver;

// Click on the element using JavaScript
js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));



	}
	}

