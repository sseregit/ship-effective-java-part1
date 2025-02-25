package jang.effective.java.chapter08.item50;

import java.util.Date;

public class Attacks {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);
        System.out.println(p);

        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(99);
        System.out.println(p);
    }
}
