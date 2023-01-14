package Videojuegos;

public class Zekrg extends Enemigos
{
    private String enjambre;
    public Zekrg(int vida, double armadura, double danio, boolean estado, String enjambre)
    {
        super(vida, armadura, danio, 0, estado, "----", "Enemigos");
        this.enjambre = enjambre;
    }

    public void verPersonaje() {
        super.verPersonaje();
        System.out.println("** Peste de la " + enjambre);
    }
}
