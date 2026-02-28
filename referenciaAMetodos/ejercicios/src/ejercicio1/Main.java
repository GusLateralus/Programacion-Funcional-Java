package ejercicio1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Reescribe este lambda a su equivalente en referencia a métodos:
        Function<String, Integer> longitud = texto -> texto.length();
        System.out.println("Lambda: "+longitud.apply("Hola"));

        Function<String, Integer> longitudRef = String::length;
        System.out.println("Referencia a métodos: "+longitudRef.apply("Hola"));


    }
}