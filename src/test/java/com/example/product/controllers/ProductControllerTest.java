package com.example.product.controllers;

import com.example.product.models.Product;
import com.example.product.services.IProductService;
import com.example.product.exception.InvalidProductIdException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;


//@SpringBootTest
class ProductControllerTest {

//    @Autowired
//    private ProductController productController;
//
//    @MockBean
//    private IProductService productService;
//
//    @Test
//    void getAllProducts() {
//
//        Product p1 = new Product();
//        p1.setName("Ankita");
//        Product p2 = new Product();
//        p2.setName("Anitha");
//        Product p3 = new Product();
//        p3.setName("Chaitanya");
//
//        List<Product> mockedResponse = Arrays.asList(p1, p2, p3);
//
//        Mockito.when(productService.getAllProducts())
//                .thenReturn(mockedResponse);
//
//        List<Product> allProducts = productController.getAllProducts();
//        Assertions.assertEquals(2, allProducts.size());
//    }
//
//    @Test
//    void getAllProductTestForException() throws InvalidProductIdException {
//
//        Mockito.when(
//                productService.getSingleProduct(25l)
//        ).thenThrow(InvalidProductIdException.class);
//        Assertions.assertThrows(InvalidProductIdException.class,
//                ()-> productController.getSingleProduct(25L)
//        );
//    }
}