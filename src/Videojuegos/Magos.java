package Videojuegos;

public class Magos extends Aliados
{
    private String subClan;
    public Magos(int vida, int mana, double danio, boolean estado, String subClan)
    {
        super(vida, 0.75, danio, mana, estado, "---", "Alianza");
        this.subClan = subClan;
    }

    public void verPersonaje() {
        super.verPersonaje();
        System.out.println("** " + subClan);
    }
}
