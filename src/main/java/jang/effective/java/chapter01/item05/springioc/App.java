package jang.effective.java.chapter01.item05.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        SpellChecker spellChecker = ac.getBean(SpellChecker.class);
        spellChecker.isValid("word");
    }
}
