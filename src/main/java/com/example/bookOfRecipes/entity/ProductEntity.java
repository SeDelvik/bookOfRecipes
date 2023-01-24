package com.example.bookOfRecipes.entity;

import java.time.*;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product")
public class ProductEntity {
    @Id
    @Column
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column
    private String description;
    @Column
    private Month startSeason;
    @Column
    private Month endSeason;
}
