package com.example.product.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@JsonSerialize
public class BaseModel implements Serializable {

    @Id
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
