/*
* 2. Con la misma lista anterior, haz un stream que:

Se quede solo con los números mayores que 2

Los multiplique por 3

Los imprima
*
*
*
* */
package ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream()
                .filter(numero -> numero>2)
                .map(numero -> numero*3)
                .forEach(System.out::println);

    }
}
