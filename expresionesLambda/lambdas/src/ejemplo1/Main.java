package ejemplo1;

public class Main {
    public static void main(String[] args) {
        // Resuelto con clases anónimas
        Operador suma = new Operador() {
            @Override
            public int operar(int num1, int num2) {
                return num1 + num2;
            }
        };

        System.out.println("Suma anónima: " + suma.operar(3, 4));

        // Resuelto con funciones anónimas

        Operador operacion = (num1, num2) -> num1 + num2;

        System.out.println("Suma desde lambda: " + operacion.operar(4, 5));


    }
}