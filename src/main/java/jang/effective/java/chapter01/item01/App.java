package jang.effective.java.chapter01.item01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = ac.getBean(HelloService.class);
        System.out.println(helloService.hello());
    }
}
