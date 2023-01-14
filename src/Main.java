import java.util.ArrayList;
import java.util.List;
import Musica.*;
import Videojuegos.*;

public class Main {
    public static void main(String[] args)
    {
        try {
            List ListaReproduccion = new ArrayList();

            ListaReproduccion.add(new Musica("Another Mendium", 15.6, "Toby Fox", 31, "VideoGame Music"));
            ListaReproduccion.add(new Musica("Throw away your mask", 5.25, "Lyn", 41, "VideoGame Music"));
            ListaReproduccion.add(new Musica("I REALLY WANT TO STAY AT YOUR HOUSE", 4.06, "Rosa Walton y Hallie Coggins", 24, "VideoGame Music"));
            imprimirElementosLista((ArrayList) ListaReproduccion);

            /*Videojuegos*/
            System.out.println("\n\n\t\t***VIDEOJUEGOS****\n");

            Enemigos enemigo = new Enemigos(100,0.52,0.75,75,true,"Juan","Lobo Gelido");
            Aliados aliado = new Aliados(100,1.25,2.26,100,true,"Israel","luz Sagrada");


        }
        catch (Exception exception0)
        {
            System.out.println("Excepcion encontrada papuh: " + exception0 + "\n");
        }
    }
    public static void imprimirElementosLista(ArrayList lista)
    {
        for (int i = 0; i < lista.size(); i++)
        {
            Genero principal = (Genero) lista.get(i);
            principal.verTodo();
            System.out.println("");
        }
    }
}