package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationEquals {

   /** Con dos string vacios al compararlos deberiamos de obtener un true */
   @Test
   public void testEqualsTest0True() {
      // : Given
      String input1 = "";
      String input2 = "";
      testTrue(input1, input2);
   }

   /** Dos string iguales como "ABC" tambien deberiamos tener true */
   @Test
   public void testEqualsTest1True() {
      // : Given
      String input1 = "ABC";
      String input2 = "ABC";
      testTrue(input1, input2);
   }


   /** Los string pueden ser letras, simbolos o números. En este caso usamos el número 1010 */
   @Test
   public void testEqualsTest2True() {
      // : Given
      String input1 = "1010";
      String input2 = "1010";
      testTrue(input1, input2);
   }

   @Test
   public void testEqualsTest0False() {
      // : Given
      String input1 = "";
      String input2 = " ";
      testFalse(input1, input2);
   }

   @Test
   public void testEqualsTest1False() {
      // : Given
      String input1 = "ABC";
      String input2 = "abc";
      testFalse(input1, input2);
   }

   private void testTrue(String input1, String input2) {
      // : When
      Boolean actual = StringManipulation.equals(input1, input2);

      //: Then
      Assert.assertEquals(true, actual);
   }

   private void testFalse(String input1, String input2) {
      // : When
      Boolean actual = StringManipulation.equals(input1, input2);

      //: Then
      Assert.assertEquals(false, actual);
   }


}
