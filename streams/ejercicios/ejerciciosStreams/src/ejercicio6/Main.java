/*
* 6. Dada una lista de números, haz un stream que:

Multiplique cada número por 3
Se quede solo con los mayores que 6
Guarde el resultado en una nueva lista
Imprima esa lista
*
*
*
*
* */
package ejercicio6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        List<Integer> nuevaLista = numeros.stream()
                .map(n -> n*3)
                .filter(n -> n>6)
                .collect(Collectors.toList()); // collect convierte el stream a una colección

        nuevaLista.forEach(System.out::println);


    }
}
