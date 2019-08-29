import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registermercurytools {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("patil");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8310265989");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("bhavani nagar kalburgi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kalburgi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("karnataka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("585104");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("INDIA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("pooja");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(1000);

	}

}
