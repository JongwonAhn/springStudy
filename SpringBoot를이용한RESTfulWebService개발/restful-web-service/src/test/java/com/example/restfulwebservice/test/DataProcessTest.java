package com.example.restfulwebservice.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DataProcessTest {

    public static void main(String[] args) {

        int a[][] = {{1,2,3}, {4,5}, {6,7,8,9}};

        for (int[] b: a) {
            for(int c : b){
//                System.out.print(c);

            }
//            System.out.println();
        }

//        Map<Object, Object> objectObjectMap = new Map<>();


    }
}

class Car{
    public  Car(){
        System.out.println("A");
    }
}

class exCar extends Car{
    public exCar(){
        super();
        System.out.println("B");
    }
}



