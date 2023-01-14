package Videojuegos;

import java.text.DecimalFormat;

public class Protagonista extends Personaje
{
    DecimalFormat dft = new DecimalFormat("0.##");
    private double danioAliadobase;
    private String clase;
    private double danioTotal;
    private double armaduraBase;
    private double armaduraTotal;
    public Protagonista(int vida, double armadura, double danio, int mana, boolean estado, String nombre, String clase) {
        super(vida, armadura, danio, mana, estado, nombre, "Protragonista");
        this.clase = clase;
        this.danioAliadobase = danio * 0.71;
        this.armaduraBase = armadura * 0.95;
        defensaTotal();
        danioTotal();
        verPersonaje();
    }

    public void verPersonaje() {
        super.verPersonaje();
        System.out.println("* " + clase);
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
        armaduraTotal = armaduraBase;
    }
}
