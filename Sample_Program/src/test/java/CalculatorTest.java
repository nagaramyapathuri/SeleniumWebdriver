import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calc=new Calculator();

  @Test
  public void add1Test() {
    Assert.assertEquals(calc.add1(5,5),10);
  }

  @Test
  public void sub1Test() {
    Assert.assertEquals(calc.sub1(10,5),5);
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("print before");
	 }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("print after");
	  }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("before the class");
	  }
  @AfterClass
  public void afterclass() {
	  System.out.println("after the class");
  }
}
