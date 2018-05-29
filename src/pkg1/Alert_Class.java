package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();


		driver.get("http://demo.guru99.com/test/delete_customer.php");

		//Enter dat in text box
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		

		//Click on submit button
		driver.findElement(By.name("submit")).submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Alert alert  = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click on ok button
		String text = alert.getText();
		System.out.println("Text of a alert box is:"+text);
		alert.dismiss();

		System.out.println("Execution is complete");
		driver.close();
	}

}
