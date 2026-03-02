package ejercicioIntegrador;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Auto> listaAutos = Arrays.asList(
                new Auto("Volkswagen","Amarok",25000),
                new Auto("Volkswagen", "Taos", 32000),
                new Auto("Chevrolet", "Onix", 22000),
                new Auto("Chevrolet", "Tracker", 300000),
                new Auto("Fiat","Cronos",21000),
                new Auto("Fiat",	"Pulse",24000),
                new Auto("Toyota","Corolla",20000),
                new Auto("Toyota","Yaris",23000),
                new Auto("Renault", "Stepway",20000),
                new Auto("Renault","Duster",27000),
                new Auto("Nissan","Versa",25000)
        );

        // a) Ordenar la lista de vehículos por precio de menor a mayor e imprimir por pantalla el resultado
        System.out.println("-------------Inciso a)---------------");
        List<Auto> ordenPrecio= new ArrayList<>(listaAutos);
        ordenPrecio.sort(Comparator.comparing(Auto::getPrecio)); //Comparator es una clase que se utiliza para comparar datos, y comparing permite elegir el criterio
        ordenPrecio.forEach(System.out::println);

        // b) Ordenar al mismo tiempo tanto por marca como por precio (ambos criterios) e imprimir el resultado por pantalla.
        System.out.println("-----------Inciso b)-----------------");
        listaAutos.stream()
                .sorted(Comparator.comparing(Auto::getMarca)
                        .thenComparing(Auto::getPrecio)) // thenComparing permite hacer comparaciones de criterios de manera encadenada, es método de Comparator.
                .forEach(System.out::println);

        // c) Extraer una lista de todos los vehículos cuyo precio no supere los 23000
        System.out.println("------------Inciso c)----------------");

        List<Auto> listaAutosBaratos = listaAutos.stream()
                .filter(auto -> auto.getPrecio()<=23000.0)
                .collect(Collectors.toList());

        listaAutosBaratos.forEach(System.out::println);


        // d) Filtrar únicamente los vehículos de marca Chevrolet y VW
        System.out.println("--------------Inciso d)-----------------");
        listaAutos.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase("chevrolet") || auto.getMarca().equalsIgnoreCase("volkswagen"))
                .forEach(System.out::println);
        // e) Mostrar todos los autos cuyo modelo contenga por lo menos una letra "a"
        System.out.println("---------------Inciso e)-----------------");
        listaAutos.stream()
                .filter(auto -> auto.getModelo().toLowerCase().contains("a"))
                .forEach(System.out::println);

        // f) Obtener el auto más caro:
        System.out.println("----------------Inciso f)-----------------");
        Auto precioMaximo=listaAutos.stream()
                .max(Comparator.comparing(Auto::getPrecio))
                .orElse(null);
                 // max() devuelve Optional, pero como no hemos visto ese tema, lo pasaremos a String. FE DE ERRATAS: NO es buena práctica hacer eso.

        System.out.println("Precio máximo: "+precioMaximo);

        // g) Calcular el precio promedio de todos los autos.
        System.out.println("------------------Inciso g)----------------");
        double precioPromedio = listaAutos.stream()
                .mapToDouble(Auto::getPrecio)
                .average()
                .orElse(0.0);
        System.out.println("Precio promedio de todos los autos: "+precioPromedio);


    }
}
