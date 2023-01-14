package Videojuegos;

public class Sanguinarios extends Enemigos
{
    private String horda;
    public Sanguinarios(int vida, double armadura, double danio, boolean estado, String horda)
    {
        super(vida, armadura, danio, 0, estado, "----", "Enemigos");
        this.horda = horda;
    }

    public void verPersonaje() {
        super.verPersonaje();
        System.out.println("** Horda de " + horda);
    }
}
