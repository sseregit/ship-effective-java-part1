package jang.effective.java.chapter04.item18.callback;

public class Service {


    public void run(FuncationToCall funcationToCall) {
        System.out.println("뭐 좀 하다가...");
        funcationToCall.call();
    }

    public static void main(String[] args) {
        Service service = new Service();
        BobFunction bobFunction = new BobFunction(service);
        BobFunctionWrapper bobFunctionWrapper = new BobFunctionWrapper(bobFunction);
        bobFunctionWrapper.run();
    }
}
