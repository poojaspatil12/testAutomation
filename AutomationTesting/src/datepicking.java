import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://thetestingworld.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Quick Demo')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='wdform_10_button2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='calendar']//tbody//tr[2]//td[2]")).click();
		Thread.sleep(1000);
		

	}

}
