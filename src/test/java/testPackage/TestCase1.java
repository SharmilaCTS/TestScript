package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void testMethod1() {
	  Assert.assertTrue(true);
	  System.out.println("TestMethod 1 is working as expected");
  }
}
