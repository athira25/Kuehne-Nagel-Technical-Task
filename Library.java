/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BookStoreApp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Library 
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