import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://facebook.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
		Thread.sleep(1000);
	    driver.close();
	}

}
