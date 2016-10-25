package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ola {
    
    
    public static void main(String[] args) {
	  //System.setProperty("webdriver.gecko.driver", "/Users/abhinav.agrawal/Downloads/geckodriver");
	   // System.setProperty("webdriver.chrome.driver", "/Users/abhinav.agrawal/Downloads/OlaCorporateAutomation/OlaCorporate/config/chromedriver");
	  
	FirefoxDriver dr = new FirefoxDriver();
	dr.get("https://www.flipkart.com");
	
	Select s = new Select(dr.findElementByXPath("hjfgdsss"));
	
	dr.findElementByName("");
	
		
	    }
	    
    }


