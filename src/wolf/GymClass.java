package wolf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GymClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.gymwolf.com/staging/";
		WebDriverWait wait = new WebDriverWait(driver, 5);
	    driver.get(baseUrl);
	    
	    driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")).click();
	    
	    WebElement email = driver.findElement(By.name("email"));
	    WebElement passwd = driver.findElement(By.name("password"));
	    WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']/.."));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(login));
	    
	    email.click();
	    email.sendKeys("mr.adhoc.testing@gmail.com");
	    passwd.click();
	    passwd.sendKeys("parool");
	    login.click();	
	    System.out.println("Login successful");
	    
	    
	    
	    driver.close();
	}
	
}
