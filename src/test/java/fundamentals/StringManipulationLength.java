package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationLength {

   /** En este caso la cadena (string) "A" es compuesta por un solo caracter por lo que la longitud debería ser 1 */
   @Test
   public void lengthOfAStringTest0() {
      // : Given
      String input = "A";
      Integer expected = 1;
      test(expected, input);
   }

   /** Si la cadena esta vací entonces deberiamos de tener una longitud igual a 0 */
   @Test
   public void lengthOfAStringTest1() {
      // : Given
      String input = "";
      Integer expected = 0;
      test(expected, input);
   }

   /** Para una cadena con "ABC" la longitud es 3 (Obvio!!) */
   @Test
   public void lengthOfAStringTest2() {
      // : Given
      String input = "ABC";
      Integer expected = 3;
      test(expected, input);
   }

   /** "Adalegion" esta compuesta por 9 caracteres.  */
   @Test
   public void lengthOfAStringTest3() {
      // : Given
      String input = "Adalegion";
      Integer expected = 9;
      test(expected, input);
   }

   private void test(Integer expected, String input) {
      // : When
      Integer actual = StringManipulation.lengthOfAString(input);

      // : Then
      Assert.assertEquals(expected, actual);
   }


}
