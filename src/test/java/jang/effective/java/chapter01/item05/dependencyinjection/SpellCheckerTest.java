package jang.effective.java.chapter01.item05.dependencyinjection;

import jang.effective.java.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        assertTrue(spellChecker.isValid("test"));
    }

}