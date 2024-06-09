import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class SeleniumDay17 {

    public static void main(String[] args) {


        ChromeOptions option = new ChromeOptions();
        //option.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        WebDriver wd = new ChromeDriver(option);



        System.out.println("PageLoad: "+wd.manage().timeouts().getPageLoadTimeout().toSeconds());
        System.out.println("IW: "+wd.manage().timeouts().getImplicitWaitTimeout().toSeconds());
        System.out.println("ScriptTimeout: "+wd.manage().timeouts().getScriptTimeout().toSeconds());

        //Need to figure it out
        wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        System.out.println("IW2: "+wd.manage().timeouts().getImplicitWaitTimeout().toSeconds());
        System.out.println("PageLoad2: "+wd.manage().timeouts().getPageLoadTimeout().toSeconds());

        wd.get("https://demo.evershop.io/account/login");

        wd.findElement(By.cssSelector("input[name='email']")  ).sendKeys("akhiljda@gmail.com");
        wd.findElement(   By.cssSelector("input[name='password']")  ).sendKeys("Password");
        wd.findElement(   By.cssSelector("button.button")  ).click();

        wd.findElement(By.xpath("//span[text()='Shop kids']")).click();


        //((JavascriptExecutor)wd).executeAsyncScript()



    }

    public void addExtensionToBrowser() {
        ChromeOptions option = new ChromeOptions();
        option.addExtensions(new File("E:\\Akhil\\PodTest\\Clients\\Self\\Bootcamp\\FullStackSDET\\Selenium\\AdBlock-Gold-No-Ads-Pure-Gold.crx"));

        WebDriver wd = new ChromeDriver(option);

        wd.get("https://www.globalsqa.com/demo-site/sliders");
    }
}