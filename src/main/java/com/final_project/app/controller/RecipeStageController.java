package com.final_project.app.controller;

import com.final_project.app.model.RecipeStage;
import com.final_project.app.repository.RecipeStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/")
public class RecipeStageController {
    @Autowired
    private RecipeStageRepository recipeStageRepository;

    @GetMapping
    public ResponseEntity<List<RecipeStage>> getAllStages(){
        return new ResponseEntity<>(recipeStageRepository.findAll(), HttpStatus.FOUND);
    }
}
