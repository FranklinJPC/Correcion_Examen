package PlatosTipicos;

public abstract class Comida
{
    private String nombrePlato;
    private int cantidadIngredientes;
    private String regionOrigen;

    public Comida(String nombrePlato, int cantidadIngredientes, String regionOrigen)
    {
        this.nombrePlato = nombrePlato;
        this.cantidadIngredientes = cantidadIngredientes;
        this.regionOrigen = regionOrigen;
    }

    protected void verPlato()
    {
        System.out.println("\n\t\t****Platos tipicos****\n");
        System.out.println("Nombre: " +  nombrePlato);
        System.out.println("Origen: " + regionOrigen);
        System.out.println("Numero Ingredientes: " + cantidadIngredientes);
    }

}
