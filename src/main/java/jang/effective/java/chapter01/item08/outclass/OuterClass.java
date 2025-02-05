package jang.effective.java.chapter01.item08.outclass;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {
        System.out.println("OuterClass.hi");
    }

    class InnerClass {

        public void hello() {
            OuterClass.this.hi();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);

        outerClass.printField();
    }

    private void printField() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }
    }
}
