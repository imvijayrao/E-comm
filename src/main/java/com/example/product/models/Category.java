package com.example.product.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel{

    private String name;
    private double price;
    private String description;
    private double amount;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Product> products;
}
