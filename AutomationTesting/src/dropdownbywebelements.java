import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbywebelements {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("http://facebook.com");
			
			   
				 driver.findElement(By.xpath("//select[@id='day']")).click();
				
				 WebElement searchDropdownBox=driver.findElement(By.xpath("//select[@id='day']"));
					
					Select item=new Select(searchDropdownBox);
					item.selectByValue("25");
					
					driver.findElement(By.xpath("//select[@id='year']")).click();
					 
					
					WebElement searchDropdownBox1=driver.findElement(By.xpath("//select[@id='year']"));
					
					Select item1=new Select(searchDropdownBox1);
					item1.selectByValue("1996");
	}

}
