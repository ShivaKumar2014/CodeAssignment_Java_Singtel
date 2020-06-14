package controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.cd.test.codeassignment.model.Animal;
import com.java.cd.test.codeassignment.model.AnimalList;

@RestController
public class AnimalController {


    @RequestMapping(value = "/getAllAnimals", method=RequestMethod.GET)
    public List<Animal> getAllAnimals() {
        return AnimalList.animals;
    }
}
