package com.example.bookOfRecipes.utils;

import java.time.*;

import com.example.bookOfRecipes.entity.ProductEntity;
import com.example.bookOfRecipes.entity.RecipeEntity;
import com.example.bookOfRecipes.services.ProductService;
import com.example.bookOfRecipes.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InitiateUtil implements CommandLineRunner {
    private final ProductService productService;
    private final RecipeService recipeService;

    @Override
    public void run(String... args) throws Exception {
        ProductEntity product = new ProductEntity();
        product.setName("testProduct");
        product.setStartSeason(Month.JANUARY);
        product.setEndSeason(Month.MARCH);
        productService.save(product);

        RecipeEntity recipe = new RecipeEntity();
        recipe.setRecipeName("testRec");
        recipe.setDate(LocalDate.now());
        recipe.setCookingTime(LocalTime.parse("20:11:03"));
        recipe.getProducts().add(product);
        recipeService.save(recipe);

        for(RecipeEntity entity: recipeService.getAll()){
            System.out.println(entity);
        }
    }
}
