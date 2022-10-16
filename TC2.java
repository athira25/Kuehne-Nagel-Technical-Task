package BookStoreApp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class TC2
{
  @Before
  public void setUp() throws InterruptedException 
  {
 	TC2_Execute junit = new TC2_Execute();
 	junit.setUp();;
 	
 	
  }
  @After
  public void tearDown() 
  {
   
  }
  @Test
  public void testselenium() throws InterruptedException 
  {
	 TC2_Execute fn = new TC2_Execute();
	 fn.testselenium();
	 
  }
  
  
}
