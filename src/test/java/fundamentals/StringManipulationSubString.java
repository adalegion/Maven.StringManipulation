package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationSubString {

   /** Muy fácil, solo la letra "T" */
   @Test
   public void subStringTest0() {
      // : Given
      String expected = "T";
      String input = "The legion is here.";
      Integer startIndex = 0;
      Integer endIndex = 1;
      test(expected, input, startIndex, endIndex);
   }

   /** Muy fácil tambien, solo la palabra "The" */
   @Test
   public void subStringTest1() {
      // : Given
      String input = "The legion is here.";
      Integer startIndex = 0;
      Integer endIndex = 3;
      String expected = "The";
      test(expected, input, startIndex, endIndex);
   }

   /** Pon atención a este test porque tiene un espacio en blanco */
   @Test
   public void subStringTest2() {
      // : Given
      String input = "The legion is here.";
      Integer startIndex = 0;
      Integer endIndex = 4;
      String expected = "The ";
      test(expected, input, startIndex, endIndex);
   }

   /** En este test la salida es la palabra "legion" */
   @Test
   public void subStringTest3() {
      // : Given
      String input = "The legion is here.";
      String expected = "legion";
      Integer startIndex = 4;
      Integer endIndex = startIndex + 6;
      test(expected, input, startIndex, endIndex);
   }

   private void test(String expected, String input, Integer startIndex, Integer endIndex) {
      // : When
      String actual = StringManipulation.subString(input, startIndex, endIndex);

      // : Then
      Assert.assertEquals(expected, actual);
   }
}
