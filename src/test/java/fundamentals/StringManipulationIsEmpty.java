package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationIsEmpty {

   @Test
   public void isEmptyTest0True() {
      // : Given
      String input = "";
      testTrue(input);
   }

   @Test
   public void isEmptyTest0False() {
      // : Given
      String input = " ";
      testFalse(input);
   }

   private void testFalse(String input) {
      // : When
      Boolean actual = StringManipulation.isEmpty(input);

      // : Then
      Assert.assertEquals(false, actual);
   }


   private void testTrue(String input) {
      // : When
      Boolean actual = StringManipulation.isEmpty(input);

      // : Then
      Assert.assertEquals(true, actual);
   }
}
