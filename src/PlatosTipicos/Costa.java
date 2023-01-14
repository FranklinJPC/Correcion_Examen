package PlatosTipicos;

public class Costa extends Comida
{
    private String ingredienteInsignia;
    public Costa(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia) {
        super(nombrePlato, cantidadIngredientes, "Costa");
        this.ingredienteInsignia = ingredienteInsignia;
        verPlato();
    }

    protected void verPlato()
    {
        super.verPlato();
        System.out.println("Ingrdiente Principal: " + ingredienteInsignia);
    }
}
