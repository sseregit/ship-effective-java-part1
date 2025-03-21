package jang.effective.java.chapter04.item18.callback;

public class BobFunctionWrapper implements FuncationToCall {

    private BobFunction bobFunction;

    public BobFunctionWrapper(BobFunction bobFunction) {
        this.bobFunction = bobFunction;
    }

    @Override
    public void call() {
        this.bobFunction.call();
        System.out.println("커피도 마실까...");
    }

    @Override
    public void run() {
        this.bobFunction.run();
    }
}
