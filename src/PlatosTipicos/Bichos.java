package PlatosTipicos;

public class Bichos extends Amazonia
{
    private int numVichos;
    public Bichos(String nombrePlato, int cantidadIngredientes, String ingredienteInsignia, int numVichos) {
        super(nombrePlato, cantidadIngredientes, ingredienteInsignia);
        this.numVichos = numVichos;
    }

    public void verPlato() {
        super.verPlato();
        System.out.println("Se uso: " + numVichos);
    }
}
