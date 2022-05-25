package DigiBoxxTestNG.DigiBoxxTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginTest {
	
	WebDriver driver;
	

	@Test
	@Parameters({"url" , "Digispace" , "emailId", "password"}) 
    public void setUp(String url , String DigiSpace, String emailId, String password) {
		
	 System.setProperty("webdriver.chrome.driver", "/Users/gaganbajwa/Downloads/chromedriver");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 	 driver.get(url);
 	 
 	 driver.findElement(By.xpath("//input[@id='workspace']")).clear();
 	 driver.findElement(By.xpath("//input[@id='workspace']")).sendKeys(DigiSpace);
 	 driver.findElement(By.xpath("//input[@id='Username']")).clear();
 	 driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(emailId);
 	 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
 	 driver.findElement(By.xpath("//button[contains(text(),'Login Now')]")).click();
 	 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
 	 
 	 
 	
	}
}
 	
 		
 		
 	
 	
	
	
