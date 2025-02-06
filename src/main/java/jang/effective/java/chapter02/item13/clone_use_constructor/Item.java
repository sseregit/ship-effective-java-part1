package jang.effective.java.chapter02.item13.clone_use_constructor;

public class Item implements Cloneable {
    private String name;

    @Override
    protected Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
