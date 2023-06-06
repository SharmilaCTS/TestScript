package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
  @Test
  public void testMethod2() {
	  Assert.assertTrue(false);
	  System.out.println("TestMethod 1 is Not working as expected");
  }
}
