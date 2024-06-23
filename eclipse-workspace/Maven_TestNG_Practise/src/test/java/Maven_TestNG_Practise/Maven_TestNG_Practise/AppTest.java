package Maven_TestNG_Practise.Maven_TestNG_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

//import org.openqa.selenium.Webdriver;



//import static org.junit.Assert.assertTrue;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    WebDriver wd;
    @BeforeClass(alwaysRun = true)
    public void preMethod() {
       wd = new ChromeDriver();
        wd.get("https://demo.evershop.io/account/login");
    }

    @Parameters({"username","password"})
    @Test(groups = {"Login","Sanity", "Positive"}, priority = 1)
    public void verifyLoginSucess(String UN, String PW) {

        String expectedURL = "https://demo.evershop.io/";

        wd.findElement(By.xpath("//input[@name='email']")).sendKeys(UN);
        wd.findElement(By.cssSelector("input[name='password']")).sendKeys(PW);

        wd.findElement(By.className("button")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String actualURL = wd.getCurrentUrl();

        //TestNG Validation: Hard Assert
        Assert.assertEquals(actualURL,expectedURL );



    }

    @Test(groups = {"Positive"}, priority = 2)
    public void clickShopButton() {
        wd.findElement(By.xpath("//a/span[text()='Shop women']")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String actualURL = wd.getCurrentUrl();
        Assert.assertEquals(actualURL, "https://demo.evershop.io/women" );
    }

    @AfterClass(alwaysRun = true, enabled = false)
    public void tearDownMethod() {
        wd.quit();
    }














    @Parameters({"username", "passwordInvalid"})
    @Test(groups = {"Login","Regression", "Negative"})
    public void verifyLoginUnSucess(String UN, String PW) {

        String expectedURL = "https://demo.evershop.io/";

        String appURL = "https://demo.evershop.io/account/login";

        wd.findElement(By.xpath("//input[@name='email']")).sendKeys(UN);
        wd.findElement(By.cssSelector("input[name='password']")).sendKeys(PW);

        wd.findElement(By.className("button")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String actualURL = wd.getCurrentUrl();

        //TestNG Validation: Hard Assert
        Assert.assertEquals(actualURL,appURL);


    }
}
