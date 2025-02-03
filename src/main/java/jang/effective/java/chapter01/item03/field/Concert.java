package jang.effective.java.chapter01.item03.field;

public class Concert {

    private final IElvis elvis;
    private boolean lightsOn;
    private boolean mainStateOpen;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }
}
