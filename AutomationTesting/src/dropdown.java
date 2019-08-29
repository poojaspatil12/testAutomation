import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://facebook.com");
		Thread.sleep(7000);
	    driver.findElement(By.xpath("//select[@id='day']")).sendKeys("22");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Aug");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1996");
		Thread.sleep(1000);
		driver.close();

	}

}
