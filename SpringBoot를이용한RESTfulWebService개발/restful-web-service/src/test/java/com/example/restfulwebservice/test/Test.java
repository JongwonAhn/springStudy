package com.example.restfulwebservice.test;

import org.hibernate.dialect.SAPDBDialect;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

class Sample<T>{

    private T obj;

    public Sample(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void printInfo(){
        System.out.println(obj.getClass().getName());
    }
}

public class Test {

    public static void main(String[] args) {

        Sample<String> s1 = new Sample<String>("안녕하세요");

//        System.out.println(s1.getClass().getName());
//        s1.printInfo();

//        System.out.println("----------");

        Sample<Integer> s3 = new Sample<Integer>(100);
//        System.out.println(s3.getObj());
//        s3.printInfo();
//        System.out.println(s3.getClass().getName());


        ArrayList<String> arr = new ArrayList<>();
//        LinkedList<String> arr = new LinkedList<>();

        arr.add("one");
        arr.add("two");
        arr.add("three");

        System.out.println(arr.get(1));
        System.out.println(arr.size());
        arr.remove(1);
        System.out.println(arr.get(1));
        System.out.println(arr.size());

        System.out.println(arr.indexOf("two"));
        System.out.println(arr.indexOf("three"));





        //---------------------------------

        for(int i = 0; i < arr.size(); i++){
            String value = arr.get(i);
        }

        new LinkedList<>();
        new Stack<>();

        HashSet<Object> h = new HashSet<>();

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 1);
        map.put("three", 1);

        int a = map.get("one");

//        System.out.println("a = " + a);



    }
}

