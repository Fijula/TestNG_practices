package Maven_TestNG_Practise.Maven_TestNG_Practise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	  @Parameters({"UN"})
	    @Test
	    public void TC1(String userName) {
	        System.out.println("AnnotationDemo2: TC1 executed!"+userName);
	    }


	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("AnnotationDemo2: beforeTest Executed");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("AnnotationDemo2: afterTest Executed");
	    }
}
