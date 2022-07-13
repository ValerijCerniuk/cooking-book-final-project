package com.final_project.app.repository;

import com.final_project.app.model.RecipeStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeStageRepository extends JpaRepository<RecipeStage, Long> {
}
