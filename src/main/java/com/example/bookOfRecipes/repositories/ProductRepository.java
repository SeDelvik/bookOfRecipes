package com.example.bookOfRecipes.repositories;

import com.example.bookOfRecipes.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
