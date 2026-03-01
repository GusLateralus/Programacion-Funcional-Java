/*
* 5. Con la misma lista de nombres, haz un stream que:
*
*
Quédate solo con los nombres que empiecen con "p"

Cuenta cuántos hay

Imprime el resultado con mensaje
*
*
* */


package ejercicio5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("ana", "luis", "pedro", "sofia", "al");

        long cantidadNombres = nombres.stream()
                .filter(nombre -> nombre.toLowerCase().startsWith("p"))
                .count();

        System.out.println("Total de nombres con P: "+cantidadNombres);

    }
}
