package fundamentals;

import org.junit.Assert;
import org.junit.Test;

public class StringManipulationContains {

   @Test
   public void containsTestTrue0() {
      // : Given
      String input = "Legion is here.";
      String contains = "is";
      test(input, contains);
   }

   @Test
   public void containsTestTrue1() {
      // : Given
      String input = "Legion is here.";
      String contains = ".";
      test(input, contains);
   }

   @Test
   public void containsTestFalse0() {
      // : Given
      String input = "Legion is here.";
      String contains = "not";
      testFalse(input, contains);
   }

   private void testFalse(String input, String contains) {
      // : When
      Boolean actual = StringManipulation.contains(input, contains);

      // : Then
      Assert.assertEquals(false, actual);
   }

   private void test(String input, String contains) {
      // : When
      Boolean actual = StringManipulation.contains(input, contains);

      // : Then
      Assert.assertEquals(true, actual);
   }
}
