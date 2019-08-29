import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				   
				
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
				
		WebElement upload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		upload.sendKeys("C:\\Users\\HP\\Documents\\ATM  Requirements.docx");
				
		driver.findElement(By.xpath("//span[contains(text(),'I accept')]")).click();

		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
				

	}

}
