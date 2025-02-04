package jang.effective.java.chapter01.item05.factorymethod;

import jang.effective.java.chapter01.item05.DefaultDictionary;
import jang.effective.java.chapter01.item05.Dictionary;

public class DefaulDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
