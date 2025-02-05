package jang.effective.java.chapter02.item10.inferitance;

import jang.effective.java.chapter02.item10.Color;
import jang.effective.java.chapter02.item10.Point;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof ColorPoint)) return false;
//        Point p = (Point) o;
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        if (!(o instanceof ColorPoint)) return o.equals(this);

        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp) + " " + cp.equals(p));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.printf("%s %s %s\n", p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }
}
