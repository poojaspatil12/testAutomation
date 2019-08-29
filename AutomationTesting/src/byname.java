import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byname {

	public static void main(String[] args) throws InterruptedException {
		

	
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
Thread.sleep(1000);

driver.get("https://facebook.com");
Thread.sleep(1000);

driver.findElement(By.name("firstname")).sendKeys("poo");
Thread.sleep(1000);
driver.findElement(By.name("lastname")).sendKeys("patil");
Thread.sleep(1000);
driver.findElement(By.name("reg_email__")).sendKeys("sfnygj");
Thread.sleep(1000);
driver.findElement(By.name("reg_passwd__")).sendKeys("fgtdd");
Thread.sleep(1000);
driver.close();
	}
}

