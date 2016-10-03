import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://techno-geek.co.uk/callmycab/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hsshs");
		driver.findElement(By.xpath(".//*[@id='development']")).click();
	}

}
