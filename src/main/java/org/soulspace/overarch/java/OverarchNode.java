package org.soulspace.overarch.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to declare an Overarch model node for a Java element.
 */
@Target({ElementType.TYPE, ElementType.PACKAGE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
// @Inherited
// @Repeatable
@Documented
public @interface OverarchNode {

    /** The element type of the overarch model node. */
    String el() default "";

    /** The id of the overarch model node. */
    String id() default "";

    /** The name of the overarch model node. */
    String name() default "";

    /** The description of the overarch model node. */
    String desc() default "";

    /** The technology of the overarch model node. */
    String tech() default "";

    /** The tags of the overarch model node. */
    String[] tags() default {};

    /** An EDN map with additional attribute values for the overarch model node. */
    String edn() default "";
}