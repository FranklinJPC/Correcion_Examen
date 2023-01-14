package Musica;

public class Genero
{
    String nombre;

    public Genero(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void verTodo()
    {
        System.out.printf("Musica.Genero: " + nombre);
    }
}
