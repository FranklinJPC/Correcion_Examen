package Musica;

public class Artista extends Genero
{
    String nombre;
    int edad;

    public Artista(String nombre, int edad, String nombreG) {
        super(nombreG);
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void verTodo()
    {
        super.verTodo();
        System.out.printf("\n* Nombre Musica.Artista: " + nombre);
        System.out.printf("\n* Edad: " + edad);
    }
}
