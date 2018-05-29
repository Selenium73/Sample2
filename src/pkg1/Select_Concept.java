package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();


		driver.get("http://10.0.3.3");
		
		
		driver.findElement(By.id("txtEmployeeId")).sendKeys("HDC7340");
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.name("btnSubmit")).click();
		
		driver.get("http://10.0.3.3/HRMSApplyForLeave.aspx");
		Select se = new Select(driver.findElement(By.id("ctl00_HRMSDefault_ddlLeaveType")));
		boolean multiple = se.isMultiple();
		System.out.println(multiple);
		

	}

}
