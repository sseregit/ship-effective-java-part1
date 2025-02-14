package jang.effective.java.chapter05.item33.bounded_type_token;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class PrintAnnotation {

    static Annotation getAnnotation(AnnotatedElement elemenet, String annotationTypeName) {
        Class<?> annotationType = null;
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return elemenet.getAnnotation(annotationType.asSubclass(Annotation.class));
    }

    public static void main(String[] args) {
        System.out.println(getAnnotation(MyService.class, FindMe.class.getName()));
    }
}
