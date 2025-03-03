package jang.effective.java.chapter02.item10.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Point {
    static Point create(int x, int y) {
        return new AutoValue_Point(x, y);
    }

    abstract int x();
    abstract int y();

}
