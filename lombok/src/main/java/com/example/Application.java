package com.example;

import com.example.entity.FirstEntity;

public class Application {

    public static void main(String[] args) {
        System.out.println("Inside Lambok Tutorial");
        FirstEntity firstEntity = new FirstEntity();
        firstEntity.setValue1(1);
        firstEntity.setValue2("Test 1");
        System.out.println(firstEntity.getValue1());
        System.out.println(firstEntity.getValue2());
    }
}
