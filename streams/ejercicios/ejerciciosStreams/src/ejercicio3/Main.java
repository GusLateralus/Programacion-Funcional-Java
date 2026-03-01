/* 3. Con la misma lista:

Multiplica todos por 2

Quédate solo con los que sean mayores que 5

Cuenta cuántos quedan
*
*
* */

package ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        long numeroElementos=lista.stream()
                .map(n -> n*2)
                .filter(n -> n > 5)
                .count(); // Cuenta elementos, pero esta operación SÍ devuelve un valor

        System.out.println(numeroElementos);
    }
}
