package com.example;

import com.example.entity.ExampleDataEntity;
import com.example.entity.ExampleValueEntity;

public class Application {

    public static void main(String[] args) {
        System.out.println("Inside Lombok Tutorial");
        ExampleDataEntity exampleDataEntity = new ExampleDataEntity(1);
        exampleDataEntity.setValue2("Data 1");
        System.out.println(exampleDataEntity.getValue1());
        System.out.println(exampleDataEntity.getValue2());

        ExampleValueEntity exampleValueEntity = new ExampleValueEntity(2, "Value 2");
        System.out.println(exampleValueEntity.getValue1());
        System.out.println(exampleValueEntity.getValue2());
    }
}
