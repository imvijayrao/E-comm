package com.example.product.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Entity
@JsonSerialize
public class Product extends BaseModel implements Serializable {

    private String name;
    private String description;
    private int price;
    private String image;

    // every product will have only one category
    // 1P : 1C
    // MP : 1C
    @ManyToOne
    private Category category;
}
