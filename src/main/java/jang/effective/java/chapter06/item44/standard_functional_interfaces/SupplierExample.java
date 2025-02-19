package jang.effective.java.chapter06.item44.standard_functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        Integer randomNumber = randomSupplier.get();
        System.out.println("randomNumber = " + randomNumber);
    }
}
