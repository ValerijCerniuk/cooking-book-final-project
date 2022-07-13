package com.final_project.app.controller;

import com.final_project.app.model.CookingRecipe;
import com.final_project.app.repository.CookingRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/")
public class CookingRecipeController {

    @Autowired
    private CookingRecipeRepository cookingRecipeRepository;

    @GetMapping
    public ResponseEntity<List<CookingRecipe>> getAllRecipe(){
        return new ResponseEntity<>(cookingRecipeRepository.findAll(), HttpStatus.FOUND);
    }
}
