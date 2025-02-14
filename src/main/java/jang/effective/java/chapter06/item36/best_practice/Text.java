package jang.effective.java.chapter06.item36.best_practice;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Text {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH;}

    private Set<Style> styles;

    public void applyStyles(Set<Style> styles) {
        System.out.printf("Applying styles: %s to text%n", Objects.requireNonNull(styles));
        this.styles = EnumSet.copyOf(styles);
    }

    public boolean isBold() {
        return styles.contains(Style.BOLD);
    }

    public boolean isItalic() {
        return styles.contains(Style.ITALIC);
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
        System.out.println(text.isBold());
    }
}
