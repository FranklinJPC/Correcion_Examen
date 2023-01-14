package Videojuegos;

public abstract class Personaje
{
    private int vida;
    private double armadura;
    private double danio;
    private int mana;
    private boolean estado;
    private String nombre;
    protected String tipo;

    public Personaje(int vida,double armadura,double danio,int mana,boolean estado,String nombre, String tipo)
    {
        this.vida = vida;
        this.armadura = armadura;
        this.danio = danio;
        this.mana = mana;
        this.estado = estado;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void verPersonaje()
    {
        System.out.println("\n***" + tipo + "****");
        System.out.println("* " + nombre);
        System.out.println("* " + vida);
        System.out.println("* " + mana);
        System.out.println("* " + estado);
    }
    protected abstract void danioTotal();
    protected abstract void defensaTotal();
}
