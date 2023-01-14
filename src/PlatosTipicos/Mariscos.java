package PlatosTipicos;

public class Mariscos extends Costa
{
    private String zonaPesca;
    public Mariscos(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia, String zonaPesca) {
        super(nombrePlato, cantidadIngredientes, ingredienteInsignia);
        this.zonaPesca = zonaPesca;
    }

    public void verPlato() {
        super.verPlato();
        System.out.println("Zona de encuentro: " + zonaPesca);
    }
}
