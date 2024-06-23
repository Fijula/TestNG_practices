package Maven_TestNG_Practise.Maven_TestNG_Practise;

import org.testng.annotations.*;

public class AnnotationDemo {

    @Parameters({"UN","PW"})
    @Test()
    public void TC1(String userName, String password) {
        System.out.println("AnnotationDemo: TC1 executed!"+userName+ ": "+password);
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite Executed");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest Executed");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass Executed");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod Executed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite Executed");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest Executed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass Executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod Executed");
    }

}
