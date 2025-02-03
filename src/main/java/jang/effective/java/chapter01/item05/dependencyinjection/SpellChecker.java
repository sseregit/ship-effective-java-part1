package jang.effective.java.chapter01.item05.dependencyinjection;

import jang.effective.java.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }

}
