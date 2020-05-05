package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationStartWith {

   @Test
   public void startWithTest0True() {
      // : Given
      String input = "Legion is here.";
      String prefix = "L";
      testTrue(input, prefix);
   }

   @Test
   public void startWithTest1True() {
      // : Given
      String input = "Legion is here.";
      String prefix = "Legion";
      testTrue(input, prefix);
   }

   @Test
   public void startWithTest2True() {
      // : Given
      String input = " Legion is here.";
      String prefix = " ";
      testTrue(input, prefix);
   }

   @Test
   public void startWithTest0False() {
      // : Given
      String input = "Legion is here.";
      String prefix = " ";
      testFalse(input, prefix);
   }

   @Test
   public void startWithTest1False() {
      // : Given
      String input = "Legion is here.";
      String prefix = "l";
      testFalse(input, prefix);
   }

   private void testFalse(String input, String prefix) {
      // : When
      Boolean actual = StringManipulation.startsWith(input, prefix);

      // : Then
      Assert.assertEquals(false, actual);
   }

   private void testTrue(String input, String prefix) {
      // : When
      Boolean actual = StringManipulation.startsWith(input, prefix);

      // : Then
      Assert.assertEquals(true, actual);
   }

}
