package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class day2Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Pras");
		driver.findElement(By.name("lastname")).sendKeys("anna");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		WebElement drop1 =driver.findElement(By.id("day"));
		Select source = new Select(drop1);
		source.selectByIndex(0);
		WebElement drop2 =driver.findElement(By.id("month"));
		Select source2 = new Select(drop2);
		source2.selectByIndex(7);
		WebElement drop3 =driver.findElement(By.id("year"));
		Select source3 = new Select(drop3);
		source3.selectByVisibleText("1987");
		//Selecting Female Gender
		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
		
	}
}
