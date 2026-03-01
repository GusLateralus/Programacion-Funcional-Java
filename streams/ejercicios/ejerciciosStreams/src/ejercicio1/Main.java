/*
* Teniendo una lista, haz un stream que:

Multiplique cada número por 2

Imprima el resultado. Usa lambdas.
*
*
* */
package ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream()
                .map( n -> n*2) //map transforma cada elemento
                .forEach(System.out::println);


    }

}
