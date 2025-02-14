package jang.effective.java.chapter05.item33.super_type_token;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class GenericTypeInfer {


    public static void main(String[] args) throws NoSuchFieldException {
        Super<String> stringSuper = new Super<>();
        System.out.println(stringSuper.getClass().getDeclaredField("value").getType());

        Type type = (new Super<String>() {
        }).getClass().getGenericSuperclass();
        ParameterizedType pType = (ParameterizedType) type;

        System.out.println(Arrays.toString(pType.getActualTypeArguments()));
    }

//    static class Sub extends Super<String> {
//
//    }

    static class Super<T> {

        T value;
    }
}
