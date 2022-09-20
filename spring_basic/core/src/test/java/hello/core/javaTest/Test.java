package hello.core.javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] score = {3,5,1,10,7};

        String arr = Arrays.toString(score);
        String type = arr.getClass().getName();

        System.out.println(Arrays.toString(score));
        System.out.println(arr);
        System.out.println(type);



        sc.close();
    }
}
