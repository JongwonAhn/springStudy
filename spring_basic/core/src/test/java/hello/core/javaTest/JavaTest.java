package hello.core.javaTest;

import java.util.*;

class TestNumber{
    String a;
    String b;

    public TestNumber(String a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class JavaTest {

    public static void main(String[] args) {

        TestNumber testNumber = new TestNumber("K", "a");

//        testNumber.setNum(100);

        sum(testNumber);

//        System.out.println(testNumber.a);
//        System.out.println(testNumber.b);

        Stack stack = new Stack();


        stack.push(1);
        stack.push(2);
        stack.push(5);

//        for (Object a:stack) {
//            System.out.println(a);
//        }
//        System.out.println(stack.peek() + "peak");

        Queue<Integer> queue = new LinkedList();
        queue.add(2);
        queue.add(4);
        queue.add(7);

        for (Object a:queue) {
            System.out.println("`a` = " + a);
        }

        queue.remove();


        for (Object a:queue) {
            System.out.println("`a` = " + a);
        }

        D d = new D();

        d.b(30);



    }

    public static TestNumber sum(TestNumber testNumber){

        testNumber.a = testNumber.a.toLowerCase();
        testNumber.b = testNumber.b.toUpperCase();

        return testNumber;
    }
}

 interface A{
    void b(int a);

    void c();
 }

 interface B{
    void e();

    void f();
 }

 abstract class Z{
    abstract void x();
 }

 class D extends Z implements A,B{

     @Override
     public void b(int a) {
         System.out.println("print a = " + a);
     }

     @Override
     public void c() {

     }

     @Override
     public void e() {

     }

     @Override
     public void f() {

     }

     @Override
     void x() {

     }
 }

