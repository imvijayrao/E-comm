package com.example.product.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity(name = "st_instructor")
@DiscriminatorValue("2")
public class Instructor extends User {

    private String specialization;
}
