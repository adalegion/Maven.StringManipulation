package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationEquals {

   /** Con dos string vacios al compararlos deberiamos de obtener un true */
   @Test
   public void testEqualsTest0() {
      // : Given
      String expected = "";
      String input1 = "";
      String input2 = "";
      test(expected, input1, input2);
   }

   /** Dos string iguales como "ABC" tambien deberiamos tener true */
   @Test
   public void testEqualsTest1() {
      // : Given
      String expected = "ABC";
      String input1 = "ABC";
      String input2 = "ABC";
      test(expected, input1, input2);
   }


   /** Los string pueden ser letras, simbolos o números. En este caso usamos el número 1010 */
   @Test
   public void testEqualsTest2() {
      // : Given
      String expected = "1010";
      String input1 = "1010";
      String input2 = "1010";
      test(expected, input1, input2);
   }

   private void test(String expected, String input1, String input2) {
      // : When
      Boolean actual = StringManipulation.equals(input1, input2);

      //: Then
      Assert.assertTrue(actual);
   }


}
