package Videojuegos;

public abstract class Personaje
{
    private int vida;
    private double armadura;
    private double danio;
    private int mana;
    private boolean estado;
    private String nombre;

    public Personaje(int vida,double armadura,double danio,int mana,boolean estado,String nombre)
    {
        this.vida = vida;
        this.armadura = armadura;
        this.danio = danio;
        this.mana = mana;
        this.estado = estado;
        this.nombre = nombre;
    }

    protected void verPersonaje(String tipo)
    {
        System.out.println("***" + tipo + "****");
        System.out.println("* " + nombre);
        System.out.println("* " + vida);
        System.out.println("* " + estado);
    }
    protected abstract void danioTotal();
    protected abstract void defensaTotal();
}
