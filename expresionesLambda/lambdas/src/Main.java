/*
* Es una forma corta de escribir funciones o bloques de código que puedes pasar como parámetros a métodos
* o usar dentro de colecciones.
*
* Es una manera de representar una función o procedimiento sin tener que escribir toda la estructura de un método
*
* Se integran desde la JDK 8, para incorporar programación funcional.
*
* Se conocen también como funciones anónimas, y básicamente implementan métodos sin necesidad de una clase.
*/

import logica.Mensajero;

/*
* Sintaxis básica;
*
*       Sin parámetros: () -> sentencia
*       Con un parámetro: Parámetro -> sentencia
*       Con más de un parámetro: (parametro1, parametro2) -> sentencia
*       Con más de una sentencia: (parametro) -> {sentencia1;
*                                                   sentencia2;};
*
*   Para poder utilizar lambdas, es necesario implementar Interfaces funcionales
* */
public class Main {
    public static void main(String[] args) {

        Mensajero mensajero = (nombre, edad) -> {System.out.println("Hola, "+nombre+". Llegó el correo");
                                                            System.out.println("Tu edad es: "+edad);};

        mensajero.emitirMensaje("Gus", 27);

    }
}