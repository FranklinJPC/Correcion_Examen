package PlatosTipicos;

public class Amazonia extends Comida
{
    private String ingredienteInsignia;
    public Amazonia(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia)
    {
        super(nombrePlato, cantidadIngredientes, "Amazonia");
        this.ingredienteInsignia = ingredienteInsignia;
    }

    public void verPlato()
    {
        super.verPlato();
        System.out.println("Ingrdiente Principal: " + ingredienteInsignia);
    }
}
