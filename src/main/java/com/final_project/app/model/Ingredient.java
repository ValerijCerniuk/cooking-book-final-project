package com.final_project.app.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_generator")
    private Long id;
    private String name;
    private String description;


    private CookingRecipe cookingRecipe;

}
