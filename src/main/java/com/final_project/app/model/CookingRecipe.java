package com.final_project.app.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CookingRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cookingRecipe_generator")
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;

    private List<RecipeStage> stages;

    private List<Ingredient> ingredients;
}
