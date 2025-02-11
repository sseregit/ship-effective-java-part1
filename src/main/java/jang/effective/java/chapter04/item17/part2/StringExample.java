package jang.effective.java.chapter04.item17.part2;

public class StringExample {

    public static void main(String[] args) {
        String name = "whiteship";
        StringBuilder namebuilder = new StringBuilder(name);
        namebuilder.append("keesun");
    }
}
