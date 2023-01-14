package Videojuegos;

import java.text.DecimalFormat;

public class Aliados extends Personaje
{
    DecimalFormat dft = new DecimalFormat("0.##");
    private double danioAliadobase;
    private String clan;
    private double danioTotal;
    private double armaduraEnemiga;
    private double armaduraTotal;
    public Aliados(int vida, double armadura, double danio, int mana, boolean estado, String nombre, String clan) {
        super(vida, armadura, danio, mana, estado, nombre);
        this.clan = clan;
        this.danioAliadobase = danio * 0.65;
        this.armaduraEnemiga = armadura * 0.80;
        defensaTotal();
        danioTotal();
        verPersonaje();
    }

    public void verPersonaje() {
        super.verPersonaje("ALIADOS");
        System.out.println("* " + clan);
        System.out.println("* " + dft.format(danioTotal) + "%");
        System.out.println("* " + dft.format(armaduraTotal) + "%");
    }

    @Override
    protected void danioTotal()
    {
        danioTotal = danioAliadobase;
    }

    @Override
    protected void defensaTotal()
    {
        armaduraTotal = armaduraEnemiga;
    }
}
