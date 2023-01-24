package com.example.bookOfRecipes.services;

import com.example.bookOfRecipes.entity.RecipeEntity;
import com.example.bookOfRecipes.repositories.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public void save(RecipeEntity entity){
        recipeRepository.save(entity);
    }

    public List<RecipeEntity> getAll(){
        return recipeRepository.findAll();
    }
}
