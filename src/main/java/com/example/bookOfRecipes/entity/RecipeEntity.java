package com.example.bookOfRecipes.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
@Data
public class RecipeEntity {
    @Id
    @Column
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long id;
    @Column
    private String recipeName;
    @Column
    private LocalDate date;
    @Column
    private String image;
    @Column
    private LocalTime cookingTime;
    @Column
    private String description;
    @Column
    @OneToMany(fetch = FetchType.EAGER)
    private List<ProductEntity> products = new ArrayList<>();
}
