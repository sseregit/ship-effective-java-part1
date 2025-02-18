package jang.effective.java.chapter06.item39.annotationwithparameter;

public class Sample2 {

    @ExceptionTest(value = ArithmeticException.class, text = "qwe")
    public static void m1() {
        int i = 0;
        i = i / i;
    }
    @ExceptionTest(IndexOutOfBoundsException.class)
    public static void m2() {
        int[] a = new int[0];
        int i = a[1];
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m3() {

    }

}
