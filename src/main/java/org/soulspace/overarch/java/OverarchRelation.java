package org.soulspace.overarch.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
// @Inherited
// @Repeatable
@Documented
public @interface OverarchRelation {
    String el() default "request";
    String id() default "";
    String from() default "";
    String to() default "";
    String name() default "";
    String desc() default "";
    String tech() default "";

}
