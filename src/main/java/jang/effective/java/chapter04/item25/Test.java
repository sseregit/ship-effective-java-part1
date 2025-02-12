package jang.effective.java.chapter04.item25;

public class Test {

    public static void main(String[] args) {
        System.out.println(Utensil.NAME+Dessert.NAME);
    }

    private static class Utensil {
        public static final String NAME = "panT";
    }

    private static class Dessert {
        public static final String NAME = "cakeT";
    }
}
