package com.example;

import com.example.entity.ExampleEntity;

public class Application {

    public static void main(String[] args) {
        System.out.println("Inside Lombok Tutorial");
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setValue1(1);
        exampleEntity.setValue2("Test 1");
        System.out.println(exampleEntity.getValue1());
        System.out.println(exampleEntity.getValue2());
        System.out.println(exampleEntity.toString());
    }
}
