import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebookbytestNG {
	WebDriver driver=new ChromeDriver();
	
	
	@BeforeTest
	
	
	public void startbrowser() throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	}
		
		@Test(priority=0)
		
		
		public void testcase1() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("hjjhh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("hjjkk");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("bhjjk");
		Thread.sleep(1000);
		
		}
		@AfterTest
		
		
		public void quit() {
			driver.close();
		}
}
	

		
		
		

