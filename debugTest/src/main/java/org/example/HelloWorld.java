package org.example;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        Test test =new Test();
        int num = add(5,3);
        System.out.println(num);
    }
    public  static int add(int i , int j){
        return i+j;
    }

}

class Test{

}