import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class getPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		driver.close();
		

	}

}
