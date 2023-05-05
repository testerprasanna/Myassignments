package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2DeleteLEad {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadId = driver.findElement(By.xpath("//a[text()='10964']"));
		String leadId1 = leadId.getText();
		System.out.println(leadId1);
		driver.findElement(By.xpath("//a[text()='10964']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10964");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement isRecord = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String isRecord1 = isRecord.getText();
		System.out.println(isRecord1);
		driver.close();

	}

}
