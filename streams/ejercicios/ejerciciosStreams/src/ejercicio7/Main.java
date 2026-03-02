/* 7. Dada la misma lista de números, haz un stream que:
*
* Multiplique todos los números entre sí usando reduce
* Imprima el resultado
*
*
*
* */
package ejercicio7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        int productoTotal=numeros.stream()
                .reduce(1, (a,b) -> a*b);

        System.out.println("Producto total: "+productoTotal);

    }
}
