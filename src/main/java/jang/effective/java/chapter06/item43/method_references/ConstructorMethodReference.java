package jang.effective.java.chapter06.item43.method_references;

import java.util.Arrays;
import java.util.List;

public class ConstructorMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("names = " + names);

        List<Person> people = names.stream()
                .map(Person::new)
//                .map(name -> new Person(name))
                .toList();

        System.out.println("people = " + people);
    }
}
