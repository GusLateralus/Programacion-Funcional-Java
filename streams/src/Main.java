import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Hay dos tipos de streams, aquellos que ocupan operaciones intermedias para una colección y los que no. Las
        // operaciones intermedias son opcionales, pero las finales son obligatorias.

        // Stream sin operación intermedia
        List<String> nombres= new ArrayList<>();
        nombres.add("Gus");
        nombres.add("Belu");
        nombres.add("Aisabel");
        nombres.add("Sitsu");
        nombres.add("Tifa");

        nombres.stream().forEach(System.out::println);

        // Stream con operación intermedia:
        List<String> paises = Arrays.asList("España", "México", "Argentina", "Colombia",
                                            "Francia", "Armenia", "Noruega", "Perú", "Brasil");

        paises.stream()
                .filter(pais -> pais.toLowerCase().contains("a"))
                .forEach(System.out::println);


    }
}