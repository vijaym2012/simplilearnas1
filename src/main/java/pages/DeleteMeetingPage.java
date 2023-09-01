package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteMeetingPage {
	
private WebDriver driver;
	
	public DeleteMeetingPage() {
		
		//link the browser//
        System.setProperty("webdriver.chrome.driver", "/Users/vijaymahar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        //create an object for the browser --> web driver
        driver=new ChromeDriver();
	    
	}
	
	public void navigateTo() {
		driver.get("http://localhost:4200/viewMeet");
	}
	
	public void navigatesTo() {
		driver.findElement(By.name("deletemeeting")).click();
	}
	
	public void confirmTo() {
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());	
		confirmationAlert.accept();
		
	}
	
	public String ismeetingDeleted() {
		System.out.println(driver.findElement(By.name("h1")).getText());
	return	driver.findElement(By.name("h1")).getText();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}