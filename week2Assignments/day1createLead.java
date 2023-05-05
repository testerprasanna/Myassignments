package week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class day1createLead {
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elangovan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prachu");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("departmentName")).sendKeys("Computer Science");
		driver.findElement(By.name("primaryEmail")).sendKeys("abc@gmail.com");
		//Extra Code for Selectors
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source =new Select(drop1);
		source.selectByVisibleText("Employee");
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source1 =new Select(drop2);
		source1.selectByValue("9001");
		WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source2 = new Select(drop3);
		source2.selectByIndex(5);
		WebElement drop4 =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select source3=new Select(drop4);
		source3.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		//Title printing
		String title = driver.getTitle();
		System.out.println(title);
	}	


}
