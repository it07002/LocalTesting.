package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
    
    
    By  sofLicense =  By.id("3f42512d37751000deeabfc8bcbe5daf");
    By sofModel=By.id("f6eabe233732100044e0bfc8bcbe5d88");
    private WebDriver driver;		
	@Test				
	public void testEasy() {
	    try{
		driver.get("https://www37b.swalife.com/servicenowtest/?SAMLRequest=nVPLbtswEPwVgXc9nTgSYRlwFRQ1kKaKpfTQG02tEgIUqXIp2%2F37UrKT%2BNAYhQ8EAe6QOzM7XCDrZNLT1WBf1QZ%2BD4DWO3RSIT1WcjIYRTVDgVSxDpBaTqvV9weaBBHtjbaaa0m8FSIYK7QqtMKhA1OB2QkOz5uHnLxa2yMNQ9Suzd61sG4FeET4Su8DrrtQsV3PXiBoNPG%2BasNhIpWTlkkE4q3vc1I9Ftso4fMmZlmbtTfb2%2FldlqZZso0gnbVtxpgDYskQxQ4%2BriIOsFZombI5SaJ47kepnyR1PKM3CU1ug7tZ%2Bot45UnOF6EaoV4ua98eQUi%2F1XXplz%2BqenpgJxowjw59jeyfYNB56DgGEVkuphHQib05n8plYuxtFGT5XwwW4XmfU9eejhrW96WWgv%2FxVlLqfWGAWafLmgGmEXXMfk4lDuLpRDR%2BO0HpMx6dIV5VjvvTwKRoBZgrrArfeZ5SC80UFxc%2FCwfrFbrrmRE4mgkHxu27neewQjqzNtBeZe5FGKd8fNsdj2Hca9OM4QLueNaGKey1sW%2FG%2F4vR8lT8RN9H%2BfznLv8C&RelayState=https://southwesttest.service-now.com/navpage.do");  
		  driver.manage().window().maximize();
		
		  driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid")).sendKeys("x226509");
		  
		  driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword")).sendKeys("Welcome@ibm2");
		 
		
		  driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_btnSubmit")).click();
		  
		  driver.findElement(By.id("filter")).sendKeys("software model");
		  Thread.sleep(1000);
		  driver.findElement(sofModel).click();;
		  Thread.sleep(1000);
		  driver.findElement(By.id("sysverb_new"));
	    }catch(Exception e){
		e.printStackTrace();
	    }

	    
		  
	//	AssertJUnit.assertTrue(title.contains("Free Selenium Tutorials")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    System.setProperty("webdriver.gecko.driver", "/Users/abhinav.agrawal/Downloads/geckodriver");
	    System.setProperty("webdriver.chrome.driver", "/Users/abhinav.agrawal/Downloads/OlaCorporateAutomation/OlaCorporate/config/chromedriver");
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		//driver.quit();			
	}		

}
