import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args) {

        // Creamos una instancia de IAnimal que luego será implementada por una clase anónima que tiene el método hacerSonido()
        IAnimal perro = new IAnimal() {
            @Override
            public void hacerSonido() {
                System.out.println("Guau Guau");
            }
        };

        new Vehiculo(){
            private int numPasajeros;

            public void manejar()
            {
                System.out.println("Estoy manejando");
            }

        }.manejar();

        // Mandamos a llamar al método hacerSonido() desde la instancia perro
        perro.hacerSonido();

    }


}