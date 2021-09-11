package br.com.projrabbitaula1.controller;

import br.com.projrabbitaula1.constant.Constant;
import br.com.projrabbitaula1.model.Animal;
import br.com.projrabbitaula1.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping(Constant.API_ANIMAL)
    public Animal save(Animal animal){
        return animalService.save(animal);
    }

    @GetMapping(Constant.API_ANIMAL)
    public List<Animal> findAll(){
        return animalService.findAll();
    }
}
