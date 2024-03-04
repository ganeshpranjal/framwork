package TestNG.Framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Attachment extends Login{

	@AfterMethod
	public void AddAttach() {
		WebDriver driver = Login.driver;
		
		WebElement Immi=driver.findElement(By.xpath("(//div[@class=\"orangehrm-tabs-wrapper\"])[5]"));
		Immi.click();
		System.out.println("Clicked on Immigration");
		WebElement Addattach = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[2]"));
		Addattach.click();
		System.out.println("Clicked on Add Attachemnts");
		WebElement Browse = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Browse.sendKeys("C:\\Users\\Pranjal\\Downloads\\Recordings (9).xlsx");
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("File Uploaded");
		System.out.println("Box");
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Attachment is Saved");

		
		
}

		
	
}