package SitePractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PopSolutions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://popsolutionsinc.com/");
		
		//pop-up
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//a[contains(text(),'CAD')])[1]")));
		WebElement data = driver.findElement(By.xpath("(.//a[contains(text(),'CAD')])[1]"));
		data.click();
		
		//Select shop
		
		driver.findElement(By.xpath("(.//*[contains(text(),'Shop Now')])[1]")).click();
		driver.findElement(By.xpath("(.//*[contains(text(),'Cupcake Boxes & Inserts')])[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(),'Twelve Mini Cupcake Box (Window) with Insert Combo Pack')][1]")));
		driver.findElement(By.xpath(".//a[contains(text(),'Twelve Mini Cupcake Box (Window) with Insert Combo Pack')][1]")).click();
		
		driver.findElement(By.id("pa_set")).click();
	    List<WebElement> links = driver.findElements(By.xpath("(.//option[@class='attached enabled'])"));
	    links.get(1).click();
	
        driver.findElement(By.xpath("(.//*[contains(text(),'ADD TO CART')])[1]")).click();
        driver.findElement(By.xpath("//div[@class='topcart']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[contains(text(),'Proceed to checkout')]")));
        driver.findElement(By.xpath(".//*[contains(text(),'Proceed to checkout')]")).click();
		   
		driver.findElement(By.id("billing_first_name")).sendKeys("Rahul");
		driver.findElement(By.id("billing_last_name")).sendKeys("Kumar");
		driver.findElement(By.id("billing_company")).sendKeys("XYZData");
		
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[data-placeholder='Select a country / region…']")),"Canada").build().perform();
		
		driver.findElement(By.id("billing_address_1")).sendKeys("1453 Harvest Moon Dr");
		driver.findElement(By.id("billing_city")).sendKeys("Unionville");
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdown = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-placeholder='Select an option…']")));

		Select provinceDropdown = new Select(dropdown);
		provinceDropdown.selectByVisibleText("Ontario");
		
		
		driver.findElement(By.id("billing_postcode")).sendKeys("L3R 0L7");
		driver.findElement(By.id("billing_phone")).sendKeys("905-911-6411");
		driver.findElement(By.id("billing_email")).sendKeys("testingupdate2@gmail.com");
		
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cardOption = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio' and @value='beanstream']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(cardOption).click().build().perform();
		//cardOption.click();
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='beanstream']")).click();
		
		
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.id("beanstream_ccnum")));
		driver.findElement(By.id("beanstream_ccnum")).sendKeys("424242424242");
		Select month = new Select(driver.findElement(By.name("beanstream_expmonth")));
		month.selectByVisibleText("June");
		
		Select year = new Select(driver.findElement(By.name("beanstream_expyear")));
		year.selectByVisibleText("2027");
		
	    driver.findElement(By.name("beanstream_cvv")).sendKeys("123");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		
	    driver.findElement(By.id("place_order")).click();
		
		
		
		
		}	

	}

