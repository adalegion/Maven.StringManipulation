### Manipulado strings

* Objetivo
  * Asegurar que todos los test pasen completando los métodos en la clase StringManipulation.
    * `Integer lengthOfAString(String input)`
    * `String toLowerCase(String input)`
    * `String toUpperCase(String input)`
    * `String subString(String input, Integer startIndex, Integer endIndex)`
    * `String concatenate(String input1, String input2)`
    * `String trim(String input)`
    * `String replace(String input, String target, String replacement)`
    * `Boolean equals(String input1, String input2)`
    * `Boolean contains(String input, String comparator)`

* Propósito 
  * Familiarizarse con los métodos más comunes para la manipulación de strings en JAVA.

<br><br>
## `Integer lengthOfAString(String input)`
* Descripción
  * Dado un string (cadena) encontrar su longitud (el número de caracteres que lo conforman).
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        String input = "ABC";
  
        // : When
        Integer outcome = StringManipulation.lengthOfAString(input);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  3
  ```
  
  ### Ejemplo 2
  * Script de muestra
  
    ```
          // : Given
          String input = "";
    
          // : When
          Integer outcome = StringManipulation.lengthOfAString(input);
    
          // : Then
           System.out.println(outcome);
    ```
  * Salida
    ```
    0
    ```
    
<br><br>
## `String toLowerCase(String input)`
* Descripción
  * Dado un string (cadena) pasar todos sus caracteres a minúsculas
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        String input = "ABC";
  
        // : When
        String outcome = StringManipulation.toLowerCase(input);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  abc
  ```
  
  ### Ejemplo 2
  * Script de muestra
  
    ```
          // : Given
          String input = "ADALEGION!";
    
          // : When
          String outcome = StringManipulation.lengthOfAString(input);
    
          // : Then
          System.out.println(outcome);
    ```
  * Salida
    ```
    adalegion!
    ```
    
<br><br>
## `String toUpperCase(String input)`
* Descripción
  * Dado un string (cadena) pasar todos sus caracteres a minúsculas
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        String input = "abc";
  
        // : When
        String outcome = StringManipulation.toUpperCase(input);
  
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  ABC
  ```
  
  ### Ejemplo 2
  * Script de muestra
  
    ```
          // : Given
          String input = "adalegion!";
    
          // : When
          String outcome = StringManipulation.lengthOfAString(input);
    
          // : Then
          System.out.println(outcome);
    ```
  * Salida
    ```
    ADALEGION!
    ```

<br><br>
## `String subString(String input, Integer startIndex, Integer endIndex)`
* Descripción
  * Dado un string (cadena) pasar todos sus caracteres a minúsculas
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        String input = "Adalegion!";
  
        // : When
        Integer startIndex = 0;
        Integer endIndex = 1;
        String outcome = StringManipulation.subString(input, startIndex, endIndex);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  A
  ```
  
  ### Ejemplo 2
  * Script de muestra
  
    ```
          // : Given
          String input = "adalegion!";
    
          // : When
          Integer startIndex = 3;
          Integer endIndex = 9;
          String outcome = StringManipulation.subString(input, startIndex, endIndex);
    
          // : Then
          System.out.println(outcome);
    ```
  * Salida
    ```
    legion
    ```

<br><br>
## `String concatenate(String input1, String input2)`
* Descripción
  * Concatenar (unir) dos diferentes strings
  
### Ejemplo 1
* Script de muestra. Nota que hay un espacio en blanco al final del input1.

  ```
        // : Given
        String input1 = "Adalegion ";
        String input2 = "is here!";
  
        // : When
        String outcome = StringManipulation.concatenate(input1, input2);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  Adalegion is here!
  ```
 
<br><br>
## `String trim(String input)`
* Descripción
  * Quitar los espacios en blanco al comienzo y al final de una cadena
  
### Ejemplo 1
* Script de muestra. Nota los 10 espacios en blanco al principio y al final que tiene la variable input.

  ```
        // : Given
        String input = "          A B          ";
  
        // : When
        String outcome = StringManipulation.trim(input);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  A B
  ```

<br><br>
## `String replace(String input, String target, String replacement)`
* Descripción
  * Reemplazar en un string ciertos caracteres (targets) con otros.
  
### Ejemplo 1
* Script de muestra. Remplazar espacios en blanco con manos.

  ```
        // : Given
        String input = " ( ͡• ͜ʖ ͡•) ";
        String target = " ";
        String replacement = "✊" 
  
        // : When
        String outcome = StringManipulation.replace(input);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  ✊( ͡• ͜ʖ ͡•)✊
  ```


<br><br>
## `Boolean equals(String input1, String input2)`
* Descripción
  * Verificar si dos string son iguales (es decir, que tienen los mismo caracteres).
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        String input1 = "( ͡• ͜ʖ ͡•)";
        String input2 = "( ͡• ͜ʖ ͡•)";
  
        // : When
        Boolean outcome = StringManipulation.equals(input);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  true
  ```
  
### Ejemplo 2
* Script de muestra. Un pollito enojado es diferente a un oso.

  ```
        // : Given
        String input1 = "(•̀ ▿ ́•)";
        String input2 = "ʕ•́ᴥ•̀ʔ";
  
        // : When
        Boolean outcome = StringManipulation.equals(input);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  false
  ```

<br><br>
## `Boolean contains(String input, String comparator)`
* Descripción
  * Verificar si un string contiene un conjunto de catacteres dentro de este.
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        String input = "Adalegion is here!";
        String comparator = "is";
  
        // : When
        Boolean outcome = StringManipulation.contains(input, comparator);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  true
  ```
  
### Ejemplo 2
* Script de muestra

  ```
        // : Given
        String input1 = "Adalegion is here!";
        String input2 = "not";
  
        // : When
        Boolean outcome = StringManipulation.contains(input, comparator);
        
        // : Then
        System.out.println(outcome);
  ```
* Salida
  ```
  false
  ```
  


- Recursos: Stackoverflow


