import java.util.ArrayList;
import java.util.List;
import Musica.*;
import PlatosTipicos.*;
import Videojuegos.*;

public class Main {
    public static void main(String[] args)
    {
        try {
            /*Musica*/
            List ListaReproduccion = new ArrayList();
            List platosTipicos = new ArrayList();
            List EnemigosLs = new ArrayList();
            List AliadosLs = new ArrayList();


            ListaReproduccion.add(new Musica("Another Mendium", 15.6, "Toby Fox", 31, "VideoGame Music"));
            ListaReproduccion.add(new Musica("Throw away your mask", 5.25, "Lyn", 41, "VideoGame Music"));
            ListaReproduccion.add(new Musica("I REALLY WANT TO STAY AT YOUR HOUSE", 4.06, "Rosa Walton y Hallie Coggins", 24, "VideoGame Music"));
            imprimirElementosLista((ArrayList) ListaReproduccion);

            /*Videojuegos*/
            System.out.println("\n\n\t\t***VIDEOJUEGOS****");

            EnemigosLs.add(new Enemigos(200,4.52,0.75,75,true,"Juan","Lobo Gelido"));
            EnemigosLs.add(new Enemigos(350,3.74,1.2,100,false,"Durotan","Lobo Gelido"));
            EnemigosLs.add(new Enemigos(300,2.22,1.75,25,true,"Garrosh","Lobo Gelido"));
            EnemigosLs.add(new Sanguinarios(450,6.12,4.1,true,"Roca Roja"));
            EnemigosLs.add(new Zekrg(75,0.2,1,true,"Lampar"));

            AliadosLs.add(new Aliados(125,1.25,2.26,100,false,"Varyan","Rey"));
            AliadosLs.add(new Aliados(100,1.25,1.26,150,true,"Anduin","Principe"));
            AliadosLs.add(new Aliados(250,2.25,3.26,200,true,"Turalyon","luz Sagrada"));
            AliadosLs.add(new Magos(75,150,0.26,true, "Academia de Lucaria"));
            AliadosLs.add(new Soldados(170,136,0.26,true,"Reconocimiento"));
            AliadosLs.add(new Soldados(150,0.78,1.23,true,"de la Esperanza"));

            Protagonista protagonista = new Protagonista(125,0.25,1.5,100,true,"Jhowellz","Paladin");
            imprimirElementosListaVJ((ArrayList) EnemigosLs);
            imprimirElementosListaVJ((ArrayList) AliadosLs);
            /*Platos tipicos*/
            platosTipicos.add(new Sierra("Hornado",7,"Cierdo"));
            platosTipicos.add(new Sierra("Fritafa",8,"Cerdo"));
            platosTipicos.add(new Costa("Encebollado",10,"Pescado"));
            platosTipicos.add(new Amazonia("Piracuru", 4,"Pescado de Rio"));
            platosTipicos.add(new Sopas("Sopa de Pollo", 4, "Pollo cocinado", "Naranja"));
            platosTipicos.add(new Mariscos("Pescado", 1, "Pescado crudo", "OCeano Pacifico"));
            platosTipicos.add(new Bichos("Chontacuro", 2, "Chontacuro", 5));
            imprimirElementosListaPT((ArrayList) platosTipicos);

        }
        catch (Exception exception0)
        {
            System.out.println("Excepcion encontrada papuh: \n" + exception0 + "\n");
        }
    }
    /*
    * Metodos para la visualizacion del los datos de las listas
    */
    public static void imprimirElementosLista(ArrayList lista)
    {
        for (int i = 0; i < lista.size(); i++)
        {
            Genero principal = (Genero) lista.get(i);
            principal.verTodo();
            System.out.println("");
        }
    }
    public static void imprimirElementosListaVJ(ArrayList lista)
    {
        for (int i = 0; i < lista.size(); i++)
        {
            Personaje principal = (Personaje) lista.get(i);
            principal.verPersonaje();
        }
    }

    public static void imprimirElementosListaPT(ArrayList lista)
    {
        for (int i = 0; i < lista.size(); i++)
        {
            Comida principal = (Comida) lista.get(i);
            principal.verPlato();
        }
    }
}