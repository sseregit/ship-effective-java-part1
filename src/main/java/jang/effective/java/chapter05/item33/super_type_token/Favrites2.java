package jang.effective.java.chapter05.item33.super_type_token;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Favrites2 {

    private final Map<TypeRef<?>, Object> favorites = new HashMap<>();

    public <T> void put(TypeRef<T> typeRef, T thing) {
        favorites.put(typeRef, thing);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(TypeRef<T> typeRef) {
        return (T) favorites.get(typeRef);
    }

    public static void main(String[] args) {
        Favrites2 f = new Favrites2();

        TypeRef<List<String>> stringTypeRef = new TypeRef<>() {
        };
        System.out.println(stringTypeRef.getType());

        TypeRef<List<Integer>> integerTypeRef = new TypeRef<>() {
        };
        System.out.println(integerTypeRef.getType());

        f.put(stringTypeRef, List.of("a", "b", "c"));
        f.put(integerTypeRef, List.of(1, 2, 3));

        f.get(stringTypeRef).forEach(System.out::println);
        f.get(integerTypeRef).forEach(System.out::println);
    }
}
