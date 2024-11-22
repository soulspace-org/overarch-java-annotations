package org.soulspace.overarch.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.SOURCE)
// @Inherited
// @Repeatable
@Documented
public @interface OverarchNode {
    String el() default "container";
    String id() default "";
    String name() default "";
    String desc() default "";
    String tech() default "";
}
