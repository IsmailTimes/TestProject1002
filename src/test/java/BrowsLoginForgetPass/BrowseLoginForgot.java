package BrowsLoginForgetPass;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class BrowseLoginForgot  {

	public static void main(String[] args) throws Throwable  {
		
		// Invoking Chrome Browser
		
		//path of chromedriver
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("i.s.m.a.i.l_1");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Ismail");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		Thread.sleep(3000);
		
	   // System.out.println(driver.findElement(By.xpath("//*[@id=\"slfErrorAlert\"] ")).getText());	    
		
	    driver.findElement(By.linkText("Forgot password?")).click();
	    
	   // driver.findElement(By.cssSelector("#f218d291a1219d4")).click();
	    
	    //driver.findElement(By.xpath("//*[@id=\"f174d439de5046c\"]")).click();
	   
	    
	

	}

}