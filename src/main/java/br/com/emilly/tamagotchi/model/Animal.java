package br.com.emilly.tamagotchi.model;

public abstract class Animal{
    protected int energia;
    protected int fome;
    protected int felicidade;

    public Animal(){
        this.energia=50;
        this.fome=50;
        this.felicidade=50;
    }

    public abstract void brincar();
    public abstract void comer();
    public abstract void dormir();
    public abstract void turno();

    protected void limitarAtributos(){
        if (energia > 100) energia = 100;
        if (energia < 0) energia = 0;

        if (fome > 100) fome = 100;
        if (fome < 0) fome = 0;

        if (felicidade > 100) felicidade = 100;
        if (felicidade < 0) felicidade = 0;
    }

    public int getEnergia(){
        return energia;
    }

    public int getFome(){
        return fome;
    }

    public int getFelicidade(){
        return felicidade;
    }
}