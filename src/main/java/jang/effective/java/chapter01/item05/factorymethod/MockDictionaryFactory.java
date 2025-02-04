package jang.effective.java.chapter01.item05.factorymethod;

import jang.effective.java.chapter01.item05.Dictionary;
import jang.effective.java.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
