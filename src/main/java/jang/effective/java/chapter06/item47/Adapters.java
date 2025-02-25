package jang.effective.java.chapter06.item47;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Adapters {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        Stream<String> stream = list.stream();

        Iterable<String> iterable = Adapters.iterableOf(stream);
        System.out.println("Iterable from Stream:");
        for (String s : iterable) {
            System.out.println(s);
        }

        Stream<String> streamFromIterable = Adapters.streamOf(iterable);
        System.out.println("Stream from Iterable:");
        streamFromIterable.forEach(System.out::println);
    }

    private static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    private static <T> Iterable<T> iterableOf(Stream<T> stream) {
        return stream::iterator;
    }
}
