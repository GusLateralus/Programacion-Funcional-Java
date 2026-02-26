/*
* Ejercicio:

a) Implementa con clase anónima un verificador que diga si un número es par.

b) Implementa con lambda uno que diga si es mayor a 100.

c) Implementa con lambda uno que diga si es número primo.
*
* */

package ejercicio2;

public class Main {

    public static void imprimirResultado(String mensajeTrue, String mensajeFalse, boolean resultado)
    {
        if(resultado)
        {
            System.out.println(mensajeTrue);
        }
        else {
            System.out.println(mensajeFalse);
        }

    }

    public static void main(String[] args) {

        Verificador verificador = new Verificador() {
            @Override
            public boolean probar(int num) {
                return num % 2 == 0;
            }
        };

        Verificador verificadorMayor = (num) -> (num>100);

        Verificador verificadorPrimo = (num) -> {

            for(int i = 2; i< num; i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
        };

        imprimirResultado("El número es par",
                "El número es impar", verificador.probar(4));
        imprimirResultado("El número es mayor a 100",
                "El número es menor a 100", verificadorMayor.probar(10));
        imprimirResultado("El número es primo",
                "El número es compuesto", verificadorPrimo.probar(4));

    }
}
