package jang.effective.java.chapter04.item23.hierarchy;

public class Circle extends Figure{

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
