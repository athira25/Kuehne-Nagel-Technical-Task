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
public class TC1 
{
  @Before
  public void setUp() throws InterruptedException 
  {
 	TC1_Execute junit = new TC1_Execute();
 	junit.openBrowser();
 	
 	
  }
  @After
  public void tearDown() 
  {
   
  }
  @Test
  public void testselenium() throws InterruptedException 
  {
	 TC1_Execute fn = new TC1_Execute();
	 fn.bookstore_actions();
	 
  }
  
  
}
