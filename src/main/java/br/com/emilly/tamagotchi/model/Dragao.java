package br.com.emilly.tamagotchi.model;

public class Dragao extends Animal {

    @Override
    public void brincar() {
        felicidade += 12;
        energia -= 15;
        fome += 15;
        limitarAtributos();
    }

    @Override
    public void comer() {
        fome -= 30;
        energia += 20;
        limitarAtributos();
    }

    @Override
    public void dormir() {
        energia += 10;
        fome += 10;
        limitarAtributos();
    }

    @Override
    public void turno() {
        energia -= 15;
        fome += 10;
        felicidade -= 7;
        limitarAtributos();
    }
}
