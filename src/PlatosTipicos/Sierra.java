package PlatosTipicos;

public class Sierra extends Comida
{
    private String ingredienteInsignia;
    public Sierra(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia)
    {
        super(nombrePlato, cantidadIngredientes, "Sierra");
        this.ingredienteInsignia = ingredienteInsignia;
    }

    public void verPlato()
    {
        super.verPlato();
        System.out.println("Ingrdiente Principal: " + ingredienteInsignia);
    }
}
