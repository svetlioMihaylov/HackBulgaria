package com.hack.annotation;

@ClassInfoAnnotation(classAuthor = "Az", cheacked = false, related = { ClassInfoAnnotation.class, String.class })
public class Main {
    public static void main(String[] args) {
        Main annotation = new Main();
        ClassInfoAnnotation annotations = annotation.getClass().getAnnotation(ClassInfoAnnotation.class);
        System.out.println(annotations.cheacked());
        System.out.println(annotations.classAuthor());
        System.out.println(annotations.revisionOfClass());
        System.out.println(annotations.annotationType());
    }
}
