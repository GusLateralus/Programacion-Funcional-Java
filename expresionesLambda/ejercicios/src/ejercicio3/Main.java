/*
* Crear un transformador de Strings que:
*
* a) Implemente una clase anónima que convierta el texto a mayúsculas.
*
*
* b) Convierta el texto a minúsculas
*
* c) Invierta el texto
*
* d) Elmine todos los espacios del texto
* */
package ejercicio3;

public class Main {

    public static void imprimirResultado(String mensaje, String cadenaTransformada)
    {
        System.out.println(mensaje+cadenaTransformada);
    }

    public static void main(String[] args) {

        Transformador transformador = new Transformador() {
            @Override
            public String transformar(String texto) {
                return texto.toUpperCase();
            }
        };

        imprimirResultado("Texto mayúsculas: ",transformador.transformar("hola"));

        Transformador transformadorMinusculas = (texto)  -> texto.toLowerCase();
        imprimirResultado("Texto minúsculas: ", transformadorMinusculas.transformar("HOLA"));

        Transformador inversorTexto = (texto) -> {

            StringBuilder textoInvertido = new StringBuilder();

            for(int i = texto.length()-1; i>=0; i--)
            {
                textoInvertido.append(texto.charAt(i));
            }

            return textoInvertido.toString();
        };
        imprimirResultado("Texto invertido: ", inversorTexto.transformar("Patricio"));

        Transformador eliminadorEspacios = (texto) -> {

            StringBuilder textoSinEspacios = new StringBuilder();

            for(int i = 0; i<= texto.length()-1;i++)
            {
                if(texto.charAt(i) != ' ')
                {
                    textoSinEspacios.append(texto.charAt(i));
                }

            }

            return textoSinEspacios.toString();
        };

        imprimirResultado("Texto sin espacios: ", eliminadorEspacios.transformar("Anita lava la tina"));

    }
}
