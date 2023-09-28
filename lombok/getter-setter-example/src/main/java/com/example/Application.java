package com.example;

import com.example.entity.ExampleEntity;

public class Application {

    public static void main(String[] args) {

        System.out.println("Inside Lombok Tutorial");
        ExampleEntity exampleEntity1 = new ExampleEntity();
        exampleEntity1.setValue1(1);
        exampleEntity1.setValue2("Test 1");
        System.out.println(exampleEntity1.getValue1());
        System.out.println(exampleEntity1.getValue2());
    }
}
