package jang.effective.java.chapter06.item44.custom_functional_interfaces;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
