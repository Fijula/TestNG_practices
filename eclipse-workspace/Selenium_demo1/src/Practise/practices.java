package Practise;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver wd = new ChromeDriver();
		
		//download a file
		// Define directory path to download file
//		ChromeOptions options  = new ChromeOptions();
        String downloadFolder = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Eclipse";
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", downloadFolder);
		
		wd.get("https://selectorshub.com/xpath-practice-page/");
		wd.findElement(By.xpath("//a[contains(text(),'Click to Download')]")).click();
       //wd.findElement(By.xpath("//a[normalize-space(text(),'Click to Download PNG File')]")).click();
	
		//upload a file
		wd.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\ASUS\\OneDrive\\Desktop\\Eclipse\\testimg.png");
 
	}

}
