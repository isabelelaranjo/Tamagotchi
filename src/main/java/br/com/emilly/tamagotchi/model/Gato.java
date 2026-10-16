package br.com.emilly.tamagotchi.model;

public class Gato extends Animal {

    @Override
    public void brincar() {
        felicidade += 10;
        energia -= 5;
        fome += 5;
        limitarAtributos();
    }

    @Override
    public void comer() {
        fome -= 15;
        energia += 10;
        limitarAtributos();
    }

    @Override
    public void dormir() {
        energia += 20;
        fome += 5;
        limitarAtributos();
    }

    @Override
    public void turno() {
        energia -= 5;
        fome += 5;
        felicidade -= 3;
        limitarAtributos();
    }
}