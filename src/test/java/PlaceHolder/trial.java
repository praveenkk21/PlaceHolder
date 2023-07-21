package PlaceHolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub --
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praveenkumar\\Documents\\chromedriver_win32 (2)\\chromedriver3.exe");
		DesiredCapabilities des = DesiredCapabilities.chrome();
		des.setAcceptInsecureCerts(true);
		ChromeOptions c = new ChromeOptions();
		c.merge(des);
		WebDriver driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.get("C:\\Users\\praveenkumar\\Desktop\\Trash\\6501.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("http://www.medinfi.com");
		WebElement AutoCom=driver.findElement(By.xpath("//*[contains(@class,'autocomplete')]"));
		wait.until(ExpectedConditions.elementToBeClickable(AutoCom));
		AutoCom.click();
		AutoCom.sendKeys("a");
		Thread.sleep(2000);
		AutoCom.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

}
