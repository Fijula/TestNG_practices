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
//	   Iframe - locate using any 3 of below case s and once iframe located perform the action
    wd.get("https://selectorshub.com/iframe-scenario/");
//    case 1: using indexing
    wd.switchTo().frame(0);
    //case 2: using iframe id/name :below id =pact1
    wd.switchTo().frame("pact1");
    //case 3: using web elemnt : below iframe is inside main ,where main id= content
    wd.switchTo().frame(wd.findElement(By.xpath("//main[@id='content']//iframe")));

    //after locating iframe send the below inside input field
    wd.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Fijula");
    
    
//nested iframes
    wd.get("https://selectorshub.com/iframe-scenario/");
    //setich to nested iframe pact2(id-parent iframe) inside pact1(id-child iframe)
    wd.switchTo().frame("pact1");
    wd.switchTo().frame("pact2");
    //once inside nested iframe send the keys in input locate using xpath
    wd.findElement(By.xpath("//input[@id='jex']")).sendKeys("Jain");
    //navigate back to parent ifrmae
    wd.switchTo().parentFrame();
    wd.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Akhil");
      
      
	}

}
