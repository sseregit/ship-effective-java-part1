package jang.effective.java.chapter06.item39.annotation_processor;

import effective.Log;

public class MyClass {

    @Log
    public void myMethod() {
        System.out.println("Inside myMethod");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
