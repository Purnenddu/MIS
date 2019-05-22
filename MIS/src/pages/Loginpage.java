package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


	   public class Loginpage {
		   

		
	  // public static void main(String[] args) throws InterruptedException     {
		   @Test
		   public  void test_LogIN() throws InterruptedException, IOException     {
			 
			   DesiredCapabilities capa = DesiredCapabilities.firefox();
			   capa.setCapability("marionette", true);
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\mfcwl\\Downloads\\seleniumJar\\geckodriver.exe");
		  
		 
		WebDriver driver = new FirefoxDriver(capa);
		    	System.out.println("Loggin in");
		    	String baseUrl = "http://cpt.stageibb.com/cpt_stage/cpt_mis/Login";
		    			    	
		    	driver.get(baseUrl);
		    	driver.manage().window().maximize();
		    	
		    	String actualTitle = driver.getTitle();
		    	System.out.println("Title: " + actualTitle);
		    			    	 
		    	driver.findElement(By.xpath("//input[@name='username']")).clear();
		    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");		    	
		   	 
		    	driver.findElement(By.xpath("//input[@name='password']")).clear();
		    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		    	
		    	String submitT = driver.findElement(By.xpath("//button[@name='submit']")).getText();
		    	System.out.println(submitT);
		    	driver.findElement(By.xpath("//button[@name='submit']")).click();
  
		    	Thread.sleep(2000);
		    	driver.quit();
		    	
		    	
		}
		   
		   
		   @Test
		   public  void test_InvalidLogIN() throws InterruptedException, IOException     {
			 
			   DesiredCapabilities capa = DesiredCapabilities.firefox();
			   capa.setCapability("marionette", true);
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\mfcwl\\Downloads\\seleniumJar\\geckodriver.exe");
		  
		 
		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(capa);
		    	System.out.println("Loggin in");
		    	String baseUrl = "http://cpt.stageibb.com/cpt_stage/cpt_mis/Login";
		    			    	
		    	driver.get(baseUrl);
		    	driver.manage().window().maximize();
		    	
		    	String actualTitle = driver.getTitle();
		    	System.out.println("Title: " + actualTitle);
		    			    	 
		    	driver.findElement(By.xpath("//input[@name='username']")).clear();
		    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("asfdsvg");		    	
		   	 
		    	driver.findElement(By.xpath("//input[@name='password']")).clear();
		    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("adFDsmin");
		    	
		    	driver.findElement(By.xpath("//button[@name='submit']")).click();
		    	
		    	//p[.='Invalid Username/Password']
		    	//String toastmsg1 = "Invalid Username/Password";
		    	String toastmsg =	driver.findElement(By.xpath("//p[.='Invalid Username/Password']")).getText();
		    	System.out.println(toastmsg);
  
		    	Thread.sleep(2000);
		    	driver.quit();
		    	
		    	
		}
		   
		   @Test
		   public  void test_LogOUT() throws InterruptedException, IOException     {
			   DesiredCapabilities capa = DesiredCapabilities.firefox();
			   capa.setCapability("marionette", false);
			   System.setProperty("webdriver.gecko.driver","C:\\Users\\mfcwl\\Downloads\\seleniumJar\\geckodriver.exe");
			   
			   
			  
			WebDriver driver = new FirefoxDriver();
			   
			   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
			    	System.out.println("Loggin in");
			    	String baseUrl = "http://cpt.stageibb.com/cpt_stage/cpt_mis/Login";
			    			    	
			    	driver.get(baseUrl);
			    	driver.manage().window().maximize();
			    	
			    	String actualTitle = driver.getTitle();
			    	System.out.println("Title: " + actualTitle);
			    			    	 
			    	driver.findElement(By.xpath("//input[@name='username']")).clear();
			    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");		    	
			   	 
			    	driver.findElement(By.xpath("//input[@name='password']")).clear();
			    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
			    	
			    	driver.findElement(By.xpath("//button[@name='submit']")).click();
	  
			    	Thread.sleep(2000);
			    	
			    	driver.findElement(By.xpath("//span[@class='no-mob']")).click();
			    	driver.findElement(By.xpath("//a[@id='logout']")).click();
			    		
			    	driver.quit();
			   
			   	   
		   }
		   
		    	
		}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	