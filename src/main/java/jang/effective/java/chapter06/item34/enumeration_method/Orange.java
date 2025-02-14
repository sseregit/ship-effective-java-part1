package jang.effective.java.chapter06.item34.enumeration_method;

public enum Orange implements Fruit {
    NAVEL(40), TEMPLE(35), BLOOD(20);

    private final int price;

    Orange(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
