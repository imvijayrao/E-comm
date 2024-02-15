package com.example.product.services;

import com.example.product.dtos.ProductResponseDto;

import java.util.List;

public class Testing {

    public static void main(String[] args) {
        /*
         Generics were inroducede in Java 5.
         Before generics, List were dealing with Object data types.

         In generics, we're expecting a specific type.
         */

        List l1 = List.of(1, 2, 3);
        List<String> l2 = List.of("1", "2", "3");

        List l3 = List.of(1, 2, "hello", new ProductResponseDto());
        List<Integer> l4 = List.of(1, 2, 3);

        System.out.println(l1.getClass());
        System.out.println(l2.getClass());
        System.out.println(l3.getClass());
        System.out.println(l4.getClass());

    }
}
