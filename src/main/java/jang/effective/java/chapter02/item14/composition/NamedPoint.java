package jang.effective.java.chapter02.item14.composition;

public class NamedPoint implements Comparable<NamedPoint> {

    private final Point point;
    private final String name;

    public NamedPoint(Point point, String name) {
        this.point = point;
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public int compareTo(NamedPoint o) {
        int result = this.point.compareTo(o.point);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
