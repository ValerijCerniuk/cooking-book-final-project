package com.final_project.app.controller;

import com.final_project.app.model.Ingredient;
import com.final_project.app.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping
    public ResponseEntity<List<Ingredient>> getAllIngredient(){
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.FOUND);
    }
}
