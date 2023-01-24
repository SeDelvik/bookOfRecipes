package com.example.bookOfRecipes.services;

import com.example.bookOfRecipes.entity.ProductEntity;
import com.example.bookOfRecipes.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void save(ProductEntity entity){
        productRepository.save(entity);
    }

    public List<ProductEntity> getAll(){
        return productRepository.findAll();
    }
}
