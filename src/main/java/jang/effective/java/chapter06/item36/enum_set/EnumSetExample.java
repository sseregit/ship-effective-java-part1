package jang.effective.java.chapter06.item36.enum_set;

import jang.effective.java.chapter06.item36.best_practice.Text;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet<Text.Style> styles = EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC);

        EnumSet<Text.Style> styles1 = EnumSet.allOf(Text.Style.class);
        System.out.println(styles1);

        EnumSet<Text.Style> styles2 = EnumSet.noneOf(Text.Style.class);
        System.out.println(styles2);

        EnumSet<Text.Style> styles3 = EnumSet.range(Text.Style.BOLD, Text.Style.UNDERLINE);
        System.out.println(styles3);

        styles3.forEach(System.out::println);

        EnumSet<Text.Style> styles4 = EnumSet.complementOf(styles3);
        System.out.println(styles4);

        boolean remove = styles3.remove(Text.Style.ITALIC);
        System.out.println(styles3);
    }
}
