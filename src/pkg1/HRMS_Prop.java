package pkg1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMS_Prop {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("F:\\Office_Workspace\\WebDriver\\src\\pkg1\\Login.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("txtEmployeeId")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));

		driver.findElement(By.name("btnSubmit")).click();
	}

}
