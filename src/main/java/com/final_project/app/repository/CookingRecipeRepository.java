package com.final_project.app.repository;

import com.final_project.app.model.CookingRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookingRecipeRepository extends JpaRepository<CookingRecipe, Long> {
}
