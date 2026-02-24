/*
* Ejercicio:

a) Implementa con clase anónima un verificador que diga si un número es par.

b) Implementa con lambda uno que diga si es mayor a 100.

c) Implementa con lambda uno que diga si es número primo.
*
* */

package ejercicio2;

public class Main {

    public static void numeroPrimo(boolean resultado)
    {
        if(resultado)
        {
            System.out.println("El número es primo");
        }
        else{
            System.out.println("El número no es primo");
        }
    }

    public static void numMayor100(boolean resultado)
    {
        if(resultado)
        {
            System.out.println("El número es mayor a 100");
        }
        else{
            System.out.println("El número no es mayor a 100");
        }
    }

    public static void parImpar(boolean resultado)
    {
        if(resultado)
        {
            System.out.println("El número ingresado es par");
        }
        else{
            System.out.println("El número ingresado es impar");
        }

    }


    public static void main(String[] args) {

        Verificador verificador = new Verificador() {
            @Override
            public boolean probar(int num) {
                if(num%2==0)
                {
                    return true;
                }
                else{
                    return false;
                }
            }
        };

        Verificador verificadorMayor = (num) -> (num>100) ? true: false;

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


        parImpar(verificador.probar(3));
        numMayor100(verificadorMayor.probar(99));
        numeroPrimo(verificadorPrimo.probar(2));
    }
}
