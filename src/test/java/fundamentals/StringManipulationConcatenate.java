package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationConcatenate {

   /** Vamos a concatenar dos simples strings (cadenas) la letra "A" con la letra "B" */
   @Test
   public void concatenateTest0() {
      // : Given
      String input1 = "A";
      String input2 = "B";
      String expected = "AB";
      test(expected, input1, input2);
   }

   /** Algo mas largo, unamos "The legion is here." con "Together we are stronger.".
    *  NOTA que NO hay un espacio entre estos dos strings.
    * */
   @Test
   public void concatenateTest1() {
      // : Given
      String input1 = "The legion is here.";
      String input2 = "Together we are stronger.";
      String expected = "The legion is here.Together we are stronger.";
      test(expected, input1, input2);
   }

   /** Que pasa!!! ¯\_( ͡• ͜ʖ ͡•)_/¯ */
   @Test
   public void concatenateTest2() {
      // : Given
      String input1 = "¯\\_( ͡• ͜ʖ";
      String input2 = " ͡•)_/¯";
      String expected = "¯\\_( ͡• ͜ʖ ͡•)_/¯";
      test(expected, input1, input2);
   }


   private void test(String expected, String input1, String input2) {
      // : When
      String actual = StringManipulation.concatenate(input1, input2);

      // : Then
      Assert.assertEquals(expected, actual);
   }


}
