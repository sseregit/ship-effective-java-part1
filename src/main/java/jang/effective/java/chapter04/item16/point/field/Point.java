package jang.effective.java.chapter04.item16.point.field;

public class Point {
    public double x;
    public double y;

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 10;
        point.y = 20;

        doSomething(point);

        System.out.println(point.x);
        System.out.println(point.y);
    }

    private static void doSomething(Point point) {
        Point localPoint = new Point();
        localPoint.x = point.x;
        localPoint.y = point.y;
    }
}
