package BookStoreApp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class TC1_Execute
{

  public void openBrowser() throws InterruptedException 
  {
 	System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriver_win64\\msedgedriver.exe");
  }
 
  public void tearDown() 
  {
   
  }
  public void bookstore_actions() throws InterruptedException 
  {
	  
	  WebDriver driver = new EdgeDriver();

	  driver.get("https://demoqa.com/");
	  driver.manage().window().maximize();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(50);
	  String xpath_ = "/html/body/div[2]/div/div/div[2]/div/div[6]";
	  driver.findElement(By.xpath(xpath_)).click();
	  String login_xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/button";
	  Thread.sleep(100);
	  driver.findElement(By.xpath(login_xpath)).click();
	  driver.findElement(By.id("userName")).sendKeys("AthiraSajan");
	  driver.findElement(By.id("password")).sendKeys("Kochu@0608");
	  driver.findElement(By.id("login")).click();
	  Thread.sleep(100);
	  
	/*  String xpath_bookpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a";
	  Thread.sleep(100);
	  driver.findElement(By.xpath(xpath_bookpath)).click();*/
	  
	  WebElement l = driver.findElement(By.linkText("Git Pocket Guide"));
	  String v = l.getAttribute("href");
	  System.out.println("Th value is: "+v);
	  l.click();
	  
	  
	  //driver.findElement(By.xpath("//a[@href='/books?book=9781449325862' and text()='Git Pocket Guide']")).click();
	  //String bookpath = <a class = "mr-2" href = "https://demoqa.com/books?book=9781449325862" title = "Git Pocket Guide" </a>;
	  //driver.findElement(By.partialLinkText("Git Pocket Guide"));
	  //WebElement elm = driver.findElement(By.xpath("a<a href=\"/books?book=9781449325862\">Git Pocket Guide</a>']"));
	  //elm.click();
	  //driver.get("<a href=\"/books?book=9781449325862\">Git Pocket Guide</a>");
	  
	  String xpath_addrecord = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button";
	  driver.findElement(By.xpath(xpath_addrecord)).click();
	  
	  driver.switchTo().alert().accept();  
  }
}
