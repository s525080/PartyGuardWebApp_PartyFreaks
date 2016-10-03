import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techno-geek.co.uk/SeleniumPractice/Form2.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("John Deo");
		driver.findElement(By.id("password")).sendKeys("John1234");

	}

}
