package com.example;

import com.example.entity.ExampleEntity;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        System.out.println("Inside Lombok Tutorial");
        ExampleEntity exampleEntity1 = new ExampleEntity();
        exampleEntity1.setValue1(1);
        exampleEntity1.setValue2("Test 1");
        System.out.println(exampleEntity1.getValue1());
        System.out.println(exampleEntity1.getValue2());
        System.out.println(exampleEntity1.toString());

        ExampleEntity exampleEntity2 = new ExampleEntity();
        exampleEntity2.setValue1(1);
        exampleEntity2.setValue2("Test 1");

        Set<ExampleEntity> exampleEntitySet = new HashSet<>();
        exampleEntitySet.add(exampleEntity1);
        exampleEntitySet.add(exampleEntity2);

        System.out.println("Set Size : " + exampleEntitySet.size());


    }
}
