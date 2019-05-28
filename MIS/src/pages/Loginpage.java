package pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		    	
		    	assertTrue(toastmsg.equals("Invalid Username/Password"));
  
		    	Thread.sleep(2000);
		    	driver.quit();
		    	
		    	
		}
		   /*
		    * 
		    * 
		  
		   
		   @Test
		   public  void test_EmptyLogIN() throws InterruptedException, IOException     {
			 
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
		    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");		    	
		   	 
		    		    	
		    	driver.findElement(By.xpath("//button[@name='submit']")).click();
		    	
		    	var firstName = $("#frName").val();

		    	JavascriptExecutor js=(JavascriptExecutor)driver;
		    	System.out.println(js.executeScript("return $(\".copyright\").text();"));

		    	
		    	
		    	
		    	String stg = driver.getWindowHandle();
		    	System.out.println(stg);
  
		    	Thread.sleep(2000);
		    	driver.quit();
		    	
		    	
		}
		
		*/
		   
		   
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
		   
		   
		   @Test
		   public  void RegistrationDealerPrincipal() throws InterruptedException, IOException     {
			 
			   //Validating Dealer registration page
			   String DPName = "othreeomoreDp";
			   String LoginID = "usernamethree";
			   String  password = "pass123";
			   
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
		     	
		    	 /*  
		    	  * 
		   	driver.findElement(By.xpath("//a[contains(.,'Dp Registration')]")).click();

	    	Thread.sleep(2000);
		    String  DealerPrincipalName =	driver.findElement(By.xpath("//label[.='Dealer Principal Name']")).getText();
		    String  MobileNumber =	driver.findElement(By.xpath("//label[contains(.,'Mobile Number')]")).getText();
		    String  EmailId =	driver.findElement(By.xpath("//label[contains(.,'Email Id')]")).getText();
		    String  LginID =	driver.findElement(By.xpath("//label[.='Login ID']")).getText();
		    String  Passwordtext =	driver.findElement(By.xpath("//label[contains(.,'Password')]")).getText();
		    String  userFormSubmit =	driver.findElement(By.xpath("//button[@id='user_form_submit_b']")).getText();
		    	assertTrue(DealerPrincipalName.equals("Dealer Principal Name"));
		    	assertTrue(MobileNumber.equals("Mobile Number"));
		    	assertTrue(EmailId.equals("Email Id"));
		    	assertTrue(LginID.equals("Login ID"));
		    	assertTrue(Passwordtext.equals("Password"));
		    	assertTrue(userFormSubmit.equals("Submit"));
		    	

		    	Thread.sleep(2000);
		    			    	// 
		    	driver.findElement(By.xpath("//input[@id='user_fname']")).sendKeys(DPName); 	
		    	driver.findElement(By.xpath("//input[@id='user_mobile']")).sendKeys("7654321098"); 	
		    	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("email@jyunmain.com"); 	
		    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(LoginID); 	
		    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password); 	
		    			    	
		    	driver.findElement(By.xpath("//button[@id='user_form_submit_b']")).click();

		    	Thread.sleep(2000);
		  		    	
		    	String  newDPcreationMsg =	driver.findElement(By.xpath("//div[@id='notification_div']")).getText();
		    	
		    	System.out.println("newDpMeassge "  + newDPcreationMsg);
		    	assertTrue(newDPcreationMsg.equals("success!Dealer Principle is registered successfully."));
		    			    	
		    	Thread.sleep(2000);
		    	
		    	*/	
		    	
		    	 driver.findElement(By.xpath("//a[contains(text(),'Dp Listing')]")).click();
		    	 driver.findElement(By.xpath("//label[contains(text(),'Search:')]//input")).click();
		    	 driver.findElement(By.xpath("//label[contains(text(),'Search:')]//input")).sendKeys(LoginID);
		    	 Thread.sleep(2000);
		    	
		
		    	 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[2]/i[1]")).click();

	    	Thread.sleep(3000);
	    	
	    	
	    	//input[@name='user_fname']
	    	// /html[1]/body[1]/section[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]
	    	//String  createdDPname  = driver.findElement(By.cssSelector("#user_fname")).getText();
	    	String  createdDPname  = driver.findElement(By.id("user_fname")).getAttribute("value");
			 System.out.println("Validated the created User:"  + createdDPname);
			 System.out.println("Validated theGivenUserName:"  + DPName);
			 assertTrue(createdDPname.equals(DPName));
			 Thread.sleep(3000);
		  
	    	//String  createdUserName  = driver.findElement(By.xpath("//label[contains(text(),'Login ID')]")).getText();
			 String  createdLogID  = driver.findElement(By.name(" username")).getAttribute("value");
			 System.out.println("createdLogID is :" +createdLogID);
			 assertTrue(createdLogID.equals(LoginID));	
		  
	    	
		    Thread.sleep(2000);
		    driver.quit();
		     	
		//tr[@class='odd']//i[@class='fa fa-pencil fa-2']
			    	
		}
		  
		   
		   @Test
		   public void Validating_InvalidandEmpty_Data_while_Creating_DealerPrincipal() throws InterruptedException, IOException     {
			 
			   // Validating Dealer registration page 
			   
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
  		    	driver.findElement(By.xpath("//a[contains(.,'Dp Registration')]")).click();
		    	

		    String  DealerPrincipalName =	driver.findElement(By.xpath("//label[.='Dealer Principal Name']")).getText();
		    String  MobileNumber =	driver.findElement(By.xpath("//label[contains(.,'Mobile Number')]")).getText();
		    String  EmailId =	driver.findElement(By.xpath("//label[contains(.,'Email Id')]")).getText();
		    String  LoginID =	driver.findElement(By.xpath("//label[.='Login ID']")).getText();
		    String  Passwordtext =	driver.findElement(By.xpath("//label[contains(.,'Password')]")).getText();
		    String  userFormSubmit =	driver.findElement(By.xpath("//button[@id='user_form_submit_b']")).getText();
		    	assertTrue(DealerPrincipalName.equals("Dealer Principal Name"));
		    	assertTrue(MobileNumber.equals("Mobile Number"));
		    	assertTrue(EmailId.equals("Email Id"));
		    	assertTrue(LoginID.equals("Login ID"));
		    	assertTrue(Passwordtext.equals("Password"));
		    	assertTrue(userFormSubmit.equals("Submit"));
		    	
		    	
		    	// Validating messages when user don't insert any value 		    	
		    	
		    	driver.findElement(By.xpath("//input[@id='user_fname']")).sendKeys(""); 	
		    	driver.findElement(By.xpath("//input[@id='user_mobile']")).sendKeys(""); 	
		    	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys(""); 	
		    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(""); 	
		    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");     	
		       	driver.findElement(By.xpath("//button[@id='user_form_submit_b']")).click();
		       	
		      String usrblnk = driver.findElement(By.xpath("//span[.='Required field. Please enter Dealer Principle Name']")).getText();
		      String MoblBlnk = driver.findElement(By.xpath("//span[.='This is a required field']")).getText();
		      String emailblank = driver.findElement(By.xpath("//span[.='Required field. Please enter Email id']")).getText();
		      String loginblnk = driver.findElement(By.xpath("//span[.='Please enter Login Id']")).getText();
		      String paasblnk = driver.findElement(By.xpath("//span[.='Please enter Password']")).getText();
		    	
		      System.out.println("BLANKUSER :"+usrblnk);
		      System.out.println("BLANKMobile :"+MoblBlnk);
		      System.out.println("BLANKemail :"+emailblank);
		      System.out.println("BLANKloginid :"+loginblnk);
		      System.out.println("BLANKpassworde :"+paasblnk);
		         
		    assertTrue(usrblnk.equals("Required field. Please enter Dealer Principle Name"));
		    assertTrue(MoblBlnk.equals("This is a required field"));
		    assertTrue(emailblank.equals("Required field. Please enter Email id"));
		    assertTrue(loginblnk.equals("Please enter Login Id"));
		    assertTrue(paasblnk.equals("Please enter Password"));
		    
			// Validating messages when user insert any incorrect value 	  
		   
		    driver.findElement(By.xpath("//input[@id='user_mobile']")).sendKeys("27899756765678"); 
		    driver.findElement(By.xpath("//input[@id='email_id']")).clear();
	    	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("205"); 	
	    	driver.findElement(By.xpath("//button[@id='user_form_submit_b']")).click();
		      
	    	
	    String MoblInValdBlnk = driver.findElement(By.xpath("//*[@id=\"user_form\"]/div/div[1]/div[2]/div[2]/span[2]")).getText();
		String emaiInValdlblank = driver.findElement(By.xpath("//*[@id=\"user_form\"]/div/div[1]/div[3]/div[1]/span[2]")).getText();
	    	
		System.out.println("InvalidMob :"+MoblInValdBlnk);
		System.out.println("Invalidemail :"+emaiInValdlblank);
		
		  assertTrue(MoblInValdBlnk.equals("Invalid.Mobile number should contain 10 numbers"));
		    assertTrue(emaiInValdlblank.equals("Invalid. Please enter a valid email id eg.john@gmail.com"));
		      	
		    	// 
		    	driver.findElement(By.xpath("//input[@id='user_fname']")).sendKeys("new2DealerPrincipal"); 	
		    	driver.findElement(By.xpath("//input[@id='user_mobile']")).clear();
		    	driver.findElement(By.xpath("//input[@id='user_mobile']")).sendKeys("7654321098"); 	
		    	driver.findElement(By.xpath("//input[@id='email_id']")).clear();
		    	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("email@jyunmain.com"); 	
		    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("new2Dprincipal"); 	
		    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass123"); 		    	
		    	
		    	driver.findElement(By.xpath("//button[@id='user_form_submit_b']")).click();
		    	
		    	Thread.sleep(1000);
			    String  duplicateDPcreationMsg =	driver.findElement(By.xpath("//p[.='Dealer Principle Already Exists!Please try another.']")).getText();
		    	// newDpMeassge warning! Dealer Principle Already Exists!Please try another.
		     	System.out.println("newDpMeassge :"  +duplicateDPcreationMsg);
		    	assertTrue(duplicateDPcreationMsg.equals("Dealer Principle Already Exists!Please try another."));
		        	
		    	Thread.sleep(2000);
		    	driver.quit();
			    	
		}
		   		   
		   		   
		   		   
		   		   
		   
		   
		    	
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	