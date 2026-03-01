/*
* 4. Teniendo una lista de nombres, haz un stream que:
*
 Se quede solo con los nombres que tengan más de 3 letras
 Los convierta a mayúsculas
 Los ordene alfabéticamente
 Los imprima
*
*
*
* */

package ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("ana", "luis", "pedro", "sofia", "al");

        nombres.stream()
                .filter(nombre -> nombre.length()>3)
                .map(nombre -> nombre.toUpperCase())
                .sorted()
                .forEach(System.out::println);

    }
}
