/*
Crea una interfaz funcional que permita calcular operaciones matemáticas con dos números.

a)Implementa resta usando clase anónima.

b)Implementa multiplicación usando lambda.

c)Implementa división usando lambda (controlando división entre cero).

* */
package ejercicio1;

public class Main{
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora() {
            @Override
            public double calcular(double n1, double n2) {
                return n1 - n2;
            }
        };

        System.out.println("La resta es: " + calculadora.calcular(4, 1));

        Calculadora calcu = (n1, n2) -> n1 * n2;

        // Puedes mejorar cómo capturas la excepción
       Calculadora calcu2 = (n1, n2) -> {
            if(n2==0)
            {
                throw new ArithmeticException("No se puede dividir entre cero");
            }
            else {
                return n1/n2;
            }

        };


        System.out.println("Multiplicación: "+calcu.calcular(4.3, 5.4));
        System.out.println("División: "+calcu2.calcular(16,0));
        
    }
}