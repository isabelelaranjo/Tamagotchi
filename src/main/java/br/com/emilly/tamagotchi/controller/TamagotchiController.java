package br.com.emilly.tamagotchi.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.emilly.tamagotchi.service.TamagotchiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TamagotchiController {

    @Autowired
    private TamagotchiService service;

     @GetMapping
     public String index(Model model) {
         model.addAttribute("gato", service.getGato());
         model.addAttribute("cachorro", service.getCachorro());
         model.addAttribute("dragao", service.getDragao());
         return "index";
     }

     @PostMapping("/gato/brincar")
     public String brincar() {
         service.getGato().brincar();
         return "redirect:/";
     }

     @PostMapping("/gato/comer")
     public String comer() {
         service.getGato().comer();
         return "redirect:/";
     }

     @PostMapping("/gato/dormir")
     public String dormir() {
         service.getGato().dormir();
         return "redirect:/";
     }

     @PostMapping("/cachorro/brincar")
     public String brincarCachorro() {
         service.getCachorro().brincar();
         return "redirect:/";
     }

     @PostMapping("/cachorro/comer")
     public String comerCachorro() {
         service.getCachorro().comer();
         return "redirect:/";
     }

     @PostMapping("/cachorro/dormir")
     public String dormirCachorro() {
         service.getCachorro().dormir();
         return "redirect:/";
     }

     @PostMapping("/dragao/brincar")
     public String brincarDragao() {
         service.getDragao().brincar();
         return "redirect:/";
     }

     @PostMapping("/dragao/comer")
     public String comerDragao() {
         service.getDragao().comer();
         return "redirect:/";
     }

     @PostMapping("/dragao/dormir")
     public String dormirDragao() {
         service.getDragao().dormir();
         return "redirect:/";
     }

}
