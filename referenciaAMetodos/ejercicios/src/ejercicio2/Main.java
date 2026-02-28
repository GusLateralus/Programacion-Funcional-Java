package ejercicio2;

import java.util.function.Consumer;

public class Main {
    public static void saludar(String nombre)
    {
        System.out.println("Hola "+nombre);
    }

    public static void main(String[] args) {
        // Versión lambda
        // Reemplaza esta línea por su referencia a métodos
        Consumer::accept;

    }
}
