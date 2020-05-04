package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationReplace {

   /** La letra "a" minúscula es el target (objetivo) por lo que al
    * encontrar una "a" minúscula en la cadena, esta será remplazada con "A"
    * */
   @Test
   public void replaceTest0() {
      // Given :
      String expected = "AAA";
      String input = "AaA";
      String target = "a";
      String replacement = "A";
      test(expected, input, target, replacement);
   }

   /** En este caso el target es un asterisco. */
   @Test
   public void replaceTest1() {
      // Given :
      String expected = "-x-";
      String input = "-*-";
      String target = "\\*";
      String replacement = "x";
      test(expected, input, target, replacement);
   }

   /** Piensa ahora como haríamos para reemplazar sólo números por equis */
   @Test
   public void replaceTest2() {
      // Given :
      String expected = "-x-x-x-";
      String input = "-1-2-3-";
      String target = "\\d";
      String replacement = "x";
      test(expected, input, target, replacement);
   }


   private void test(String expected, String input, String target, String replacement) {
      // : When
      String actual = StringManipulation.replace(input, target, replacement);

      // : Then
      Assert.assertEquals(expected, actual);
   }


}
