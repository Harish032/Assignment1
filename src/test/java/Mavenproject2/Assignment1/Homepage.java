package Mavenproject2.Assignment1;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Homepage {

	public WebDriver driver;
@Test
	public void Browseropen() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("https://blazedemo.com/");
    Thread.sleep(1000);
    driver.manage().window().maximize(); 
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    String title =driver.getTitle();
    System.out.println("Home page Title is :"+title);
    if (title.equalsIgnoreCase("blazedemo"))
    {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Fail");
    }
    Select DepartCity=new Select (driver.findElement((By.name("fromPort"))));
    		DepartCity.selectByValue("Boston");  
    		Thread.sleep(2000);		
    		
    Select DestCity=new Select (driver.findElement((By.name("toPort"))));
    DestCity.selectByVisibleText("New York");
	Thread.sleep(2000);	
    
    driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);	
    
    String title2=driver.getTitle();
    System.out.println("navigated page title  is :"+title2);
    if(title2.equalsIgnoreCase("BlazeDemo - reserve"))
    {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Fail");
    }
    
    //driver.findElement(By.xpath("//input([@type='submit'])[1]")).click();
    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
    Thread.sleep(1000);
 
    
    String purchase =driver.getTitle();
     System.out.println("navigated page title  is :"+purchase);
     
    if(purchase.equalsIgnoreCase("BlazeDemo Purchase"))
    {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Fail");
    }
    
    driver.findElement(By.id("inputName")).sendKeys("Harish");
	Thread.sleep(2000);	
    driver.findElement(By.id("creditCardNumber")).sendKeys("100100100");
	Thread.sleep(2000);	
    driver.findElement(By.id("nameOnCard")).sendKeys("Srihari");
	Thread.sleep(2000);	
    
    WebElement checkbox1=driver.findElement(By.id("rememberMe"));
    checkbox1.click();
    		if(checkbox1.isSelected())
    			{
    			System.out.println("PASS : Radio Button Selected"); 
    			} 
    		else
    		{ 
    			System.out.println("FAIL : Radio Button Not Selected"); 
   	
    		}
   
   driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
    Thread.sleep(1000);
    String confirmation =driver.getTitle();
    System.out.println("navigated page title  is :"+confirmation);
    if(confirmation.equalsIgnoreCase("BlazeDemo Confirmation"))
    {
    	System.out.println("Pass");
    }
    else {
    	System.out.println("Fail");
    }
    String amount= driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
    System.out.println("Amount is:"+amount);
	Thread.sleep(2000);	
    String Card_Number= driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
    System.out.println("Card number  is:"+ Card_Number);
	Thread.sleep(2000);	
    String expiry_date= driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]")).getText();   
    System.out.println("expiry date  is:"+ expiry_date);
	Thread.sleep(2000);	
    driver.quit();
	}
	
}
