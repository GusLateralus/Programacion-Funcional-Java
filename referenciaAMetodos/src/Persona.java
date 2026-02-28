public class Persona {

    String nombre;
    double estatura;

    public Persona()
    {

    }

    public Persona(String nombre, double estatura)
    {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public void saludar(){

        System.out.println("Hola, mi nombre es: "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                '}';
    }
}
