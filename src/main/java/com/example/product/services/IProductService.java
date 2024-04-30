package com.example.product.services;

import com.example.product.dtos.CreateProductRequestDto;
import com.example.product.dtos.ProductRequestDto;
import com.example.product.exception.InvalidProductIdException;
import com.example.product.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    public Product getSingleProduct(Long id) throws InvalidProductIdException;

    List<Product> getAllProducts();

    Product updateProduct(Long id, ProductRequestDto productRequestDto);

    Page<Product> getProductByName(String name, int pageSize, int startingIndex);

    void createProduct(CreateProductRequestDto createProductRequestDto);
}
