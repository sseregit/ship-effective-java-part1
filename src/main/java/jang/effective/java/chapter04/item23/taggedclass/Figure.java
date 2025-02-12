package jang.effective.java.chapter04.item23.taggedclass;

public class Figure {
    final Shape shape;
    double length;
    double width;
    double radius;

    public Figure(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    public Figure(double length, double width) {
        if (this.length == this.width) {
            shape = Shape.SQUARE;
        } else {
            shape = Shape.RECTANGLE;
        }
        this.length = length;
        this.width = width;

    }

    double area() {
        return switch (shape) {
            case RECTANGLE, SQUARE -> length * width;
            case CIRCLE -> Math.PI * (radius * radius);
            default -> throw new AssertionError(shape);
        };
    }

    enum Shape {RECTANGLE, CIRCLE, SQUARE}
}
