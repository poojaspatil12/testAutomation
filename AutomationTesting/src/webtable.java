import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		
		for(int i=2; i<=7; i++) {
		String  actualXpath = beforeXpath+i+afterXpath;
		
		 
		 WebElement element=driver.findElement(By.xpath(actualXpath));
		 System.out.println(element.getText());
		 


		}
	}
}