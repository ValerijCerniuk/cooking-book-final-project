package com.final_project.app.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeStage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipeStage_generator")
    private Long id;
    private String instruction;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id", nullable=false)
    private CookingRecipe cookingRecipe;
}
