package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
		String ExpectedUrl = "https://www.saucedemo.com/";
		String ActualUrl = driver.getCurrentUrl();

		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Url Match");
		}
		else {
			System.out.println("Not Match");
		}
		
		Assert.assertEquals(ActualUrl, ExpectedUrl, "Conditions true");

	}

}
