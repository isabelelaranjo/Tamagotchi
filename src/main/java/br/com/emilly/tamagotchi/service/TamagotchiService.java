package br.com.emilly.tamagotchi.service;

import org.springframework.stereotype.Service;

 import br.com.emilly.tamagotchi.model.Animal;
 import br.com.emilly.tamagotchi.model.Cachorro;
 import br.com.emilly.tamagotchi.model.Dragao;
 import br.com.emilly.tamagotchi.model.Gato;

@Service
public class TamagotchiService {

     private Animal gato = new Gato();
     private Animal cachorro = new Cachorro();
     private Animal dragao = new Dragao();

     public Animal getGato() {
         return gato;
     }

     public Animal getCachorro() {
         return cachorro;
     }

     public Animal getDragao() {
         return dragao;
    }

}
