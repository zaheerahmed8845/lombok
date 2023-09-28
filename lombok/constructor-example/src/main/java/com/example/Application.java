package com.example;

import com.example.entity.ExampleAllArgEntity;
import com.example.entity.ExampleMulArgEntity;
import com.example.entity.ExampleNoArgEntity;
import com.example.entity.ExampleReqArgEntity;

public class Application {

    public static void main(String[] args) {

        System.out.println("Inside Lombok Tutorial");
        System.out.println("No Argument Constructor");
        ExampleNoArgEntity exampleNoArgEntity = new ExampleNoArgEntity();
        exampleNoArgEntity.setValue1(1);
        exampleNoArgEntity.setValue2("Test 1");
        System.out.println(exampleNoArgEntity.getValue1());
        System.out.println(exampleNoArgEntity.getValue2());

        System.out.println("Required Argument Constructor");
        ExampleReqArgEntity exampleReqArgEntity = new ExampleReqArgEntity(1);
        exampleReqArgEntity.setValue2("Test 2");
        System.out.println(exampleNoArgEntity.getValue1());
        System.out.println(exampleNoArgEntity.getValue2());

        System.out.println("All Argument Constructor");
        ExampleAllArgEntity exampleAllArgEntity = new ExampleAllArgEntity(1, "Test 3");
        System.out.println(exampleAllArgEntity.getValue1());
        System.out.println(exampleAllArgEntity.getValue2());

        System.out.println("Multiple Argument Constructor");
        ExampleMulArgEntity exampleMulArgEntity = new ExampleMulArgEntity(1, "Test 4");
        System.out.println(exampleMulArgEntity.getValue1());
        System.out.println(exampleMulArgEntity.getValue2());
    }
}
