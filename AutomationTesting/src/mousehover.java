import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
					
		//MouseHover functions
	   Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).build().perform();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
	   driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("huuyu");
	   driver.findElement(By.xpath("//*[@id='continue']")).click();
	   


	}

}
