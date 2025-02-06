package jang.effective.java.chapter02.item10.inferitance;

import jang.effective.java.chapter02.item10.Color;

public class SmellPointTest {

    /**
     * -Xss2M
     * @param args
     */
    public static void main(String[] args) {
        SmellPoint p1 = new SmellPoint(1, 0, "sweat");
        ColorPoint p2 = new ColorPoint(1, 0, Color.RED);
        p1.equals(p2);
    }
}
