package jang.effective.java.chapter01.item05.staticutils;

import jang.effective.java.chapter01.item05.DefaultDictionary;
import jang.effective.java.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private static final Dictionary dictionary = new DefaultDictionary();

    public SpellChecker() {
    }

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
