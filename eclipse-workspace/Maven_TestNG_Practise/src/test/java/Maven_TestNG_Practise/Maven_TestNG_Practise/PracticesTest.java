package Maven_TestNG_Practise.Maven_TestNG_Practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PracticesTest {
  @Test(groups = {"Positive"})
  public void f() {
	  System.out.print("My test area");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.print("Pre");
  }

  @AfterClass(groups = {"Positive"})
  public void afterClass() {
	  System.out.print("Post");
  }
  

}
