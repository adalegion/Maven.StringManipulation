package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationCasing {

   /** Muy fácil, la letra "a" minuscula debe ser convertida a "A" mayúscula */
   @Test
   public void toLowerCaseTest0() {
      // : Given
      String expected = "a";
      String input = "A";
      test(expected, input);
   }

   /** Una oración con sólo mayúsculas debe ser convertida a minúsculas */
   @Test
   public void toLowerCaseTest1() {
      // : Given
      String expected = "THE LEGION IS HERE.";
      String input = "the legion is here.";
      test(expected, input);
   }

   /** Esta es similar a una de las anteriores pero al revés, la "A" mayúscula debe convertirse a "a" minúscula*/
   @Test
   public void toUpperCaseTest0() {
      // : Given
      String expected = "A";
      String input = "a";
      test1(expected, input);
   }

   /** Otra vez, una oración con solo minúsculas debe ser convertida a mayúsculas  */
   @Test
   public void toUpperCaseTest1() {
      // : Given
      String expected = "The legion is here.";
      String input = "THE LEGION IS HERE.";
      test1(expected, input);
   }

   private void test(String expected, String input) {
      // : When
      String actual = StringManipulation.toLowerCase(input);

      // : Then
      Assert.assertEquals(expected, actual);
   }

   private void test1(String expected, String input) {
      // : When
      String actual = StringManipulation.toUpperCase(input);

      // : Then
      Assert.assertEquals(expected, actual);
   }
}
