import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookbyid {

	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://facebook.com");
		Thread.sleep(7000);
		driver.findElement(By.id("u_0_l")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_n")).sendKeys("patil");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_q")).sendKeys("pooja@gmail.com");
		Thread.sleep(1000);
		driver.close();
		
	    
	}

}
