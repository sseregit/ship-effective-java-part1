package jang.effective.java.chapter02.item14.inheritance;

public class Point implements Comparable<Point> {

    final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        int result = Integer.compare(x, point.x);
        if (result == 0) {
            result = Integer.compare(y, point.y);
        }
        return result;
    }
}
