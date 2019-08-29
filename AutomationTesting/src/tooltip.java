import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		String tooltip=driver.findElement(By.xpath("//*[@id='menu_download']/a")).getAttribute("title");
		System.out.println("Tooltip is=" +tooltip);
		
		
		

	}

}
