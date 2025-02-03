package jang.effective.java.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    private Elvis() {
        if (created)
            throw new UnsupportedOperationException("can't be created");

        created = true;
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!!");
    }

    @Override
    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you");
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
