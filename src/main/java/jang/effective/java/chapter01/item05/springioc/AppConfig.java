package jang.effective.java.chapter01.item05.springioc;

import jang.effective.java.chapter01.item05.Dictionary;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = App.class)
public class AppConfig {

//    @Bean
    SpellChecker spellChecker(Dictionary dictionary) {
        return new SpellChecker(dictionary);
    }

//    @Bean
    Dictionary dictionary() {
        return new SpringDictionary();
    }
}
