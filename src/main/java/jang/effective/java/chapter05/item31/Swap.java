package jang.effective.java.chapter05.item31;

import java.util.Arrays;
import java.util.List;

public class Swap {

    /*public static <E> void swap(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }*/

    public static void swap(List<?> list, int i, int j) {
//        list.set(i, list.set(j, list.get(i)));
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList("keesun", "whiteship", "z");
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);
    }

}
