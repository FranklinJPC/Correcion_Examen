package PlatosTipicos;

public class Sopas extends Sierra
{
    private String jugo;
    public Sopas(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia, String jugo) {
        super(nombrePlato, cantidadIngredientes, ingredienteInsignia);
        this.jugo = jugo;
    }

    public void verPlato() {
        super.verPlato();
        System.out.println("Jugo Acompaniaado: " + jugo);
    }
}
