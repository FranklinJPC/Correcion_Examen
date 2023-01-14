package Videojuegos;

import java.text.DecimalFormat;

public class Enemigos extends Personaje
{
    DecimalFormat dft = new DecimalFormat("0.##");
    private double danioEnemigosBase;
    private String clan;
    private double danioTotal;
    private double armaduraEnemiga;
    private double armaduraTotal;
    public Enemigos(int vida, double armadura, double danio, int mana, boolean estado, String nombre, String clan) {
        super(vida, armadura, danio, mana, estado, nombre);
        this.clan = clan;
        this.danioEnemigosBase = danio * 0.75;
        this.armaduraEnemiga = armadura * 0.52;
        defensaTotal();
        danioTotal();
        verPersonaje();
    }

    public void verPersonaje() {
        super.verPersonaje("ENEMIGOS");
        System.out.println("* " + clan);
        System.out.println("* " + dft.format(danioTotal) + "%");
        System.out.println("* " + dft.format(armaduraTotal) + "%");
    }

    @Override
    protected void danioTotal()
    {
        danioTotal = danioEnemigosBase;
    }

    @Override
    protected void defensaTotal()
    {
        armaduraTotal = armaduraEnemiga;
    }
}
