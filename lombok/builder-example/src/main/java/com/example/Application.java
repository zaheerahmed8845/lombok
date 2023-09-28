package com.example;

import com.example.entity.ExampleEntity;

public class Application {

    public static void main(String[] args) {
        System.out.println("Inside Lombok Tutorial");
        ExampleEntity exampleEntity = ExampleEntity.builder()
                .value1(1)
                .value2("Test 2")
                .build();
        System.out.println(exampleEntity.getValue1());
        System.out.println(exampleEntity.getValue2());
    }
}
