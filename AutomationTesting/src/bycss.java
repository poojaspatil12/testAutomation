import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bycss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://facebook.com");
		Thread.sleep(7000);
		
		driver.findElement(By.cssSelector("#u_0_l")).sendKeys("tehh");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#u_0_n")).sendKeys("patil");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#u_0_q")).sendKeys("gfshh");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#u_0_x")).sendKeys("ujjgj");
		Thread.sleep(1000);
		driver.close();
		

	}

}
