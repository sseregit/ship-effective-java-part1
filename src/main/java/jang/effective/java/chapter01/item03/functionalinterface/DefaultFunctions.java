package jang.effective.java.chapter01.item03.functionalinterface;

import jang.effective.java.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {
        Function<Integer, String> intToString = (i) -> "hello";

        Supplier<Person> integerSupplier = Person::new;
        Function<LocalDate, Person> personFUnction = Person::new;

        Consumer<Integer> integerConsumer = System.out::println;

        Predicate<Integer> predicate;
    }
}
