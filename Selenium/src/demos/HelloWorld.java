package demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.Assert;
//import org.openqa.selenium.support.ui.Select;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("This is a selenium project");
		System.setProperty("webdriver.chrome.driver", "/Applications/Selenium/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  //Test 1: Navigate to www.google.com and search for ‘ProQuest’.  Write the titles of all results on the first page to a text file on the operating system.
		  driver.get("https://www.google.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("q")).sendKeys("ProQuest");
		  driver.findElement(By.name("btnK")).submit();
		  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]//div[1]/a/h3")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title=\"TrustArc Cookie Consent Manager\"]")));
		  driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div[2]/div[2]/a[1]")).click();
		  driver.findElement(By.id("gwt-debug-close_id")).click();
		  driver.switchTo().defaultContent();
		  
		  File f = new File("/Applications/Selenium/temp.txt");       // Only required if you do not have existing file    
          try {
			f.createNewFile();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
          
         // String s = driver.getTitle();
          // To store and display all the links                            
          List<WebElement> alllinkspresent=driver.findElements(By.tagName("a"));
//          java.util.Iterator<WebElement> i = alllinkspresent.iterator();
//          while(i.hasNext()) {
//              WebElement row = i.next();
//              System.out.println(row.getText());
//          }
       
          System.out.println(s);
          System.out.println(alllinkspresent.size());
       
          //Write the links to temp.txt file.
          FileWriter w = null;
			try {
				w = new FileWriter("/Applications/Selenium/temp.txt");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			for (int j=0; j<alllinkspresent.size(); j++) {
				String text = alllinkspresent.get(j).getText();
				System.out.println(text);
				
			       
					 BufferedWriter out = new BufferedWriter(w); 
					 //w.append(text);
					 
					 try {
						out.write(text);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					 try {
						out.flush();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			}
		  
		  //Test 2. Open the ProQuest website from the results, search for ‘QA’ in the top nav, and take a screenshot.

		  driver.findElement(By.name("searchKeyword")).sendKeys("QA");
		  driver.findElement(By.id("proQuestSearch")).click();
		  
		  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
		   // now copy the  screenshot to desired location using copyFile //method
		  FileUtils.copyFile(src, new File("/Applications/Selenium/screenshot.png"));
		  }
		   
	  catch (IOException e)
		   {
		  System.out.println(e.getMessage());
		   }
	   	  
		  
		driver.quit();
		    
		
	}

}
