package PlatosTipicos;

public class Costa extends Comida
{
    private String ingredienteInsignia;
    public Costa(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia) {
        super(nombrePlato, cantidadIngredientes, "Costa");
        this.ingredienteInsignia = ingredienteInsignia;
    }

    public void verPlato()
    {
        super.verPlato();
        System.out.println("Ingrdiente Principal: " + ingredienteInsignia);
    }
}
