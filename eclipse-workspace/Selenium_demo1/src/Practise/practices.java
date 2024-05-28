package Practise;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practices {

	public static void main(String[] args) {

	WebDriver wd = new ChromeDriver();
	//main tab
	 wd.get("https://selectorshub.com/xpath-practice-page/");
	 String currentWindowHandle = wd.getWindowHandle();
     System.out.println("before:"+currentWindowHandle);
	 //another tab
	 wd.findElement(By.xpath("//a[contains(text(),'Find out how to automate these controls without XPath')]")).click();
	 
	 //store all handle ids as set
	 Set<String> handles = wd.getWindowHandles();
	  System.out.println("Number of tabs opened up are: "+handles.size());
	 
	  //map all tabs title with handle id
	  Map<String,String> tabMap = new HashMap<>();
	  for(String s:handles)
		  tabMap.put(wd.getTitle(),s);
		  
	  //Print map titles
	  Set<String> titles = tabMap.keySet();
	  
	  for(String t:titles)
		  System.out.println("Title is : "+t+"and handle id is : "+tabMap.get(t));
	  
	  
	//Extract the handle id based on Title name from the map(get value for title key)
      String aiTabHnadleId = tabMap.get("AI-Based Test Automation Tool [2024] - testRigor Software Testing");
	 //switch to above handle id
      wd.switchTo().window(aiTabHnadleId);
      //click button (use xpath with indeixng)
      wd.findElement(By.xpath("(//a[contains(text(),'Start testRigor Free')])[1]")).click();
      
      
      //case2
      //open new blank tab to switch to it
      wd.switchTo().newWindow(WindowType.TAB);
      wd.get("https://podtest.in");
      
      //session id need to downcast
      
      SessionId sid= ((RemoteWebDriver) wd).getSessionId();
      System.out.println("Session id"+sid);
      
      //case3
      //open a new blank window and swicth to it
      wd.switchTo().newWindow(WindowType.WINDOW);
      wd.get("https://youtube.com/@podtest");
      
      System.out.println("Total handle id's are: "+wd.getWindowHandles().size());

      SessionId s2 = ((RemoteWebDriver) wd).getSessionId();
      System.out.println("Session id"+s2);
      
      
      //note: only 1 session is created as we called only 1 instance one chromedriver()
      // there will 5 handle ids but the session id remains same , even when a new window opened it opens a window within the same session
      
      
      
      
      //SVG
/*
 *      SVG elements exist in a separate XML namespace distinct from the HTML namespace.
When using XPath or CSS selectors to target SVG elements, we need to specify the local name of the element within the SVG namespace.
 To create a xpath for a svg element, we have the syntax as //*[local-name()='svg'].
 */
    //a[@class='logo-icon']//*[local-name()='svg']
    //a[@class='logo-icon']//*[local-name()='svg']
//      a.logo-icon svg
      
      
	}

}
