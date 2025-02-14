package jang.effective.java.chapter06.item34.integer_values;

public class FruitStore {

    public int getPrice(int fruit) {
        return switch (fruit) {
            case Fruits.APPLE_FUJI -> 100;
            case Fruits.APPLE_PIPPIN -> 200;
            case Fruits.APPLE_GRANNY_SMITH -> 300;
            case Fruits.ORANGE_NAVEL -> 150;
            case Fruits.ORANGE_TEMPLE -> 250;
            case Fruits.ORANGE_BLOOD -> 350;
            default -> throw new IllegalStateException("No such fruit");
        };
    }

    public String getNameOfFruit(int fruit) {
        return switch (fruit) {
            case Fruits.APPLE_FUJI -> "APPLE_FUJI";
            case Fruits.APPLE_PIPPIN -> "APPLE_PIPPIN";
            case Fruits.APPLE_GRANNY_SMITH -> "APPLE_GRANNY_SMITH";
            case Fruits.ORANGE_NAVEL -> "ORANGE_NAVEL";
            case Fruits.ORANGE_TEMPLE -> "ORANGE_TEMPLE";
            case Fruits.ORANGE_BLOOD -> "ORANGE_BLOOD";
            default -> throw new IllegalStateException("No such fruit");
        };
    }

    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore();
        System.out.println(fruitStore.getPrice(Fruits.APPLE_FUJI));
        System.out.println(fruitStore.getPrice(4));
        System.out.println(fruitStore.getNameOfFruit(Fruits.APPLE_FUJI));
        System.out.println(fruitStore.getNameOfFruit(4));
    }
}
