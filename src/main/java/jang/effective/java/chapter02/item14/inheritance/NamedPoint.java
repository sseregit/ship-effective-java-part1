package jang.effective.java.chapter02.item14.inheritance;

import java.util.Comparator;
import java.util.TreeSet;

public class NamedPoint extends Point {

    final private String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedPoint{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        NamedPoint p1 = new NamedPoint(1, 0, "keesun");
        NamedPoint p2 = new NamedPoint(1, 0, "whiteship");

        TreeSet<NamedPoint> points = new TreeSet<>(new Comparator<NamedPoint>() {
            @Override
            public int compare(NamedPoint p1, NamedPoint p2) {
                int result = Integer.compare(p1.x, p2.x);
                if (result == 0) {
                    result = Integer.compare(p1.y, p2.y);
                    if (result == 0) {
                        result = p1.name.compareTo(p2.name);
                    }
                }
                return result;
            }
        });

        points.add(p2);
        points.add(p1);

        System.out.println(points);
    }
}
