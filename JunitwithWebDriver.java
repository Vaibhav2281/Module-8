package simple;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JunitwithWebDriver {

	//W.a.maven program to create Junit with webdriver Program
	
	private static EdgeDriver driver;
	WebElement element;
	
	@BeforeClass
	public static void setup() throws InterruptedException {
		System.setProperty("webdriver.edgedriver.driver", "D:\\Edge Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("facebook", Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
