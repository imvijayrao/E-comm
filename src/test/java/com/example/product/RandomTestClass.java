package com.example.product;

import com.example.product.controllers.ProductController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class RandomTestClass {


    @Test
    public void understandDifferentAssertions(){

        // Arrange
        int a = 1;
        int b = 1;

        // Act
        int x = a+b;

        // Assert
//        assert x==3;
        Assertions.assertEquals(2, x);
        Assertions.assertThrows(ArithmeticException.class, ()->divideByZero());
        Assertions.assertNull(removeElements()); // assertNotNull
        Assertions.assertNotEquals(3, x);

        int[] input = {4, 3, 5, 2, 1, 11, 10};
        int[] expected = {1, 2, 3, 4, 5, 10, 11};

        Arrays.sort(input);
        // you want to check if input and expected are same ?
        for(int i=0; i<input.length; i++){
            assert input[i]==expected[i];
        }

        Assertions.assertArrayEquals(input, expected);

        List<String> students1 = Arrays.asList("keerthi", "chaitanya, ankita");
        List<String> students2 = Arrays.asList("keerthi", "chaitanya, ankita");

        Assertions.assertLinesMatch(students1, students2);

        // timeout
        Assertions.assertTimeout(Duration.ofSeconds(2), ()->findMaxSubarraySum(input));
    }

    public int findMaxSubarraySum(int[] numbers) throws InterruptedException {

        // implement later.

//        Thread.sleep(3000);
       return 10;
    }

    public int divideByZero(){
        return 1/0;
    }

    public String removeElements(){
        return null;
    }
}
