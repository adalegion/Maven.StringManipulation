package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationTrim {

   /** El string (cadena) "   123" tiene tres espacios al inicio, recortarlos (o podarlos) es la cuestión */
   @Test
   public void trimTest0() {
      // : Given
      String expected = "123";
      String input = "   123";
      test(expected, input);
   }

   /** El mêtodo trim remueve los espacios vacíos al principio y al final de una cadena. Esto es util si estamos
    * limpiando informacion (data) proveniente de un archivo o algún otra fuente.
    * */
   @Test
   public void trimTest1() {
      // : Given
      String expected = "123";
      String input = "   123   ";
      test(expected, input);
   }


   private void test(String expected, String input) {
      // When :
      String actual = StringManipulation.trim(input);

      // Then :
      Assert.assertEquals(expected, actual);

   }


}
