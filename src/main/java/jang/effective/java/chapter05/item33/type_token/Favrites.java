package jang.effective.java.chapter05.item33.type_token;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favrites {

    private final Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> clazz, T value) {
        map.put(Objects.requireNonNull(clazz), clazz.cast(value));
    }

    public <T> T get(Class<T> clazz) {
        return clazz.cast(map.get(clazz));
    }

    public static void main(String[] args) {
        Favrites favrites = new Favrites();
//        favrites.put(String.class, 1);
//        favrites.put((Class) String.class, 1);

//        favrites.put(String.class, "1");
        favrites.put(Integer.class, 2);
//        favrites.put(Integer.class, "2");

        Integer i = favrites.get(Integer.class);
        String s = favrites.get(String.class);

/*
        favrites.put(List<Integer>.class, List.of(1, 2, 3));
        favrites.put(List<String>.class, List.of("a", "b", "c"));

        List list = favrites.get(List.class);
        list.forEach(System.out::println);
*/
    }
}
