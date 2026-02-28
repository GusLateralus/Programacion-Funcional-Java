import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // La referencia a métodos es una forma más compacta y elegante de escribir lambdas cuando queremos reutilizar código.

        //Hay 4 tipos principales:
        //Java tiene interfaces funcionales propias del lenguaje

        // 1. Referencia a un método estático: Usa un método perteneciente a la clase y no a un objeto
        Function<Integer, String> convertidor = String::valueOf; //Function<TipoEntrada,TipoSalida>
        String resultado = convertidor.apply(35);
        System.out.println("El resultado es: "+resultado);

        // 2. Referencia a un método de instancia de un objeto:
        Persona perso = new Persona();
        perso.nombre = "Gus";

        Runnable saludo = perso::saludar; //solo ejecuta, no recibe nada
        saludo.run();

        // 3. Referencia a un constructor, es útil cuando tienes que crear muchos objetos de forma dinámica
        BiFunction<String, Double, Persona> crearPersona = Persona::new;

        Persona perso2 = crearPersona.apply("Gus", 1.74);

        System.out.println("La persona es: "+perso2);

        // 4. Referencia a un método de instancia de un objeto arbitrario: Trabajas con varios objetos que están en un conjunto
        List<Persona> personas = new ArrayList<>();
        personas.add(new Empleado());
        personas.add(new Gerente());
        personas.add(new Empleado());
        personas.add(new Gerente());

        personas.forEach(Persona::saludar);





    }
}