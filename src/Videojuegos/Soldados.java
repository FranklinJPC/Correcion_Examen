package Videojuegos;

public class Soldados extends Aliados
{
    private String legion;
    public Soldados(int vida, double armadura, double danio, boolean estado, String legion)
    {
        super(vida, armadura, danio, 0, estado, "----", "Alianza");
        this.legion = legion;
    }

    public void verPersonaje() {
        super.verPersonaje();
        System.out.println("** Legion " + legion);
    }
}
