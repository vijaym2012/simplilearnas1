package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteClientPage {
	
private WebDriver driver;
	
	public DeleteClientPage() {
		
		//link the browser//
        System.setProperty("webdriver.chrome.driver", "/Users/vijaymahar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        //create an object for the browser --> web driver
        driver=new ChromeDriver();
	    
	}
	
	public void navigateTo() {
		driver.get("http://localhost:4200/viewClient");
	}
	
	public void navigatesTo() {
		driver.findElement(By.name("deleteclient")).click();
	}
	
	public void confirmTo() {
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());	
		confirmationAlert.accept();
		
	}
	
	public String isclientDeleted() {
		System.out.println(driver.findElement(By.name("h1")).getText());
	return	driver.findElement(By.name("h1")).getText();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}