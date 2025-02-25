package jang.effective.java.chapter08.item51;

import java.util.List;

public class ConvenienceMethodsExample {

    public class TooManyConvenienceMethods {
        private List<String> elements;

        public TooManyConvenienceMethods(List<String> elements) {
            this.elements = elements;
        }

        public void addElements(String element) {
            elements.add(element);
        }

        public void removeElement(String element) {
            elements.remove(element);
        }

        public boolean containsElement(String element) {
            return elements.contains(element);
        }

        public int getElementCount() {
            return elements.size();
        }

        public String getElementAt(int index) {
            return elements.get(index);
        }
    }

    public class AppropriateMethods {
        private List<String> elements;

        public AppropriateMethods(List<String> elements) {
            this.elements = elements;
        }

        public void addElements(String element) {
            elements.add(element);
        }

        public void removeElement(String element) {
            elements.remove(element);
        }

        public boolean containsElement(String element) {
            return elements.contains(element);
        }

    }

    public static void main(String[] args) {
        List<String> elements = List.of("Apple", "Banana", "Cherry");

        TooManyConvenienceMethods tooMany = new ConvenienceMethodsExample().new TooManyConvenienceMethods(elements);
        AppropriateMethods approprivate = new ConvenienceMethodsExample().new AppropriateMethods(elements);
    }
}
