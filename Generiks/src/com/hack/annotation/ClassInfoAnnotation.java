package com.hack.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfoAnnotation {
    String classAuthor() default  "Me";
    int revisionOfClass() default 1;
    boolean cheacked() default true;
    Class<?> [] related();
 }
