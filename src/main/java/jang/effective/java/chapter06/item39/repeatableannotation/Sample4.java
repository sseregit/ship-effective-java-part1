package jang.effective.java.chapter06.item39.repeatableannotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Sample4 {

    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] a = new int[0];
        int i = a[1];
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m3() {

    }

    @ExceptionTestContainer({
            @ExceptionTest(ArithmeticException.class),
            @ExceptionTest(IndexOutOfBoundsException.class)
    })
    public static void m4() {

    }

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doubleyBad() {
        List<String> list = new ArrayList<>();

        list.addAll(5, null);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<Sample4> sample4Class = Sample4.class;
        /*Method m1 = sample4Class.getMethod("m1");
        ExceptionTest[] annotationsByType = m1.getAnnotationsByType(ExceptionTest.class);
        for (ExceptionTest exceptionTest : annotationsByType) {
            System.out.println(exceptionTest);
        }
        System.out.println("==================================");
        ExceptionTestContainer[] annotationsByType1 = m1.getAnnotationsByType(ExceptionTestContainer.class);
        for (ExceptionTestContainer exceptionTestContainer : annotationsByType1) {
            System.out.println(exceptionTestContainer);
        }
        System.out.println("==================================");
        System.out.println(m1.isAnnotationPresent(ExceptionTest.class));
        System.out.println(m1.isAnnotationPresent(ExceptionTestContainer.class));*/

/*
        Method doubleyBad = sample4Class.getMethod("doubleyBad");
        ExceptionTest[] annotationsByType2 = doubleyBad.getAnnotationsByType(ExceptionTest.class);
        for (ExceptionTest exceptionTest : annotationsByType2) {
            System.out.println(exceptionTest);
        }

        System.out.println("==================================");

        ExceptionTestContainer[] annotationsByType3 = doubleyBad.getAnnotationsByType(ExceptionTestContainer.class);
        for (ExceptionTestContainer exceptionTestContainer : annotationsByType3) {
            System.out.println(exceptionTestContainer);
        }

        System.out.println("==================================");

        System.out.println(doubleyBad.isAnnotationPresent(ExceptionTest.class));
        System.out.println(doubleyBad.isAnnotationPresent(ExceptionTestContainer.class));
*/

        Method m4 = sample4Class.getMethod("m4");
        ExceptionTest[] annotationsByType4 = m4.getAnnotationsByType(ExceptionTest.class);
        for (ExceptionTest exceptionTest : annotationsByType4) {
            System.out.println(exceptionTest);
        }

        System.out.println("==================================");

        ExceptionTestContainer[] annotationsByType5 = m4.getAnnotationsByType(ExceptionTestContainer.class);
        for (ExceptionTestContainer exceptionTestContainer : annotationsByType5) {
            System.out.println(exceptionTestContainer);
        }

        System.out.println("==================================");

        System.out.println(m4.isAnnotationPresent(ExceptionTest.class));
        System.out.println(m4.isAnnotationPresent(ExceptionTestContainer.class));
    }

}
