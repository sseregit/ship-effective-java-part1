package jang.effective.java.chapter01.item02.varargs;

import java.util.Arrays;

public class VarargsSample {

    public void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        VarargsSample sample = new VarargsSample();
        sample.printNumbers(5, 10);
    }
}
