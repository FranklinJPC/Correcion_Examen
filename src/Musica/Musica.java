package Musica;

public class Musica extends Artista
{
    String nombre;
    double duracion;

    public Musica(String nombre, double duracion, String nombreArt, int edad, String nombreG)
    {
        super(nombreArt, edad, nombreG);
        this.nombre = nombre;
        this.duracion = duracion;
    }
    public void verTodo()
    {
        super.verTodo();
        System.out.println("\n* Musica.Musica: " + nombre);
        System.out.printf("\n* Duracion: " + duracion + " min");
        System.out.println();
    }
}
