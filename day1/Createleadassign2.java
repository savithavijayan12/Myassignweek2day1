package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createleadassign2 {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SaranyFebBatch1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("shanmugam");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead -Title");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Lead - SaranyFebBatch created successfully.");
		
		
		
		
	}
	
	}
