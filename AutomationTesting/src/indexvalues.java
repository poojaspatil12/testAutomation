import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indexvalues {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("https://facebook.com");
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//select[@id='day']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='day']/option[9]")).click();
			Thread.sleep(1000);
		    driver.findElement(By.xpath("//select[@id='month']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//select[@id='month']/option[3]")).click();
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='year']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='year']/option[1]")).click();
			Thread.sleep(1000);
			driver.close();
		}

}
