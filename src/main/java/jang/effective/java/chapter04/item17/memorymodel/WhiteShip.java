package jang.effective.java.chapter04.item17.memorymodel;

public class WhiteShip {

    private final int x;
    private final int y;

    public WhiteShip() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        WhiteShip whiteShip = new WhiteShip();
    }
}
