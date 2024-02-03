import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImrozNiwas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	        // Set username and password
	        
		
		driver.get("https://imrozniwas.wpengine.com/");
		 Alert alert = driver.switchTo().alert();

	        // Input your credentials in the alert
	        alert.sendKeys("demo");
	        alert.sendKeys("\t"); // Press Tab to move to the password field
	        alert.sendKeys("demodemo");

	        // Accept (OK) the alert to submit the credentials
	        alert.accept();
		
	}

}
