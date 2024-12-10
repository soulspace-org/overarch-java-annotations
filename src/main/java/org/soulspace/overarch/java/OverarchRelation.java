package org.soulspace.overarch.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to declare an Overarch model relation for a Java element.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
// @Inherited
// @Repeatable
@Documented
public @interface OverarchRelation {

    /** The element type of the overarch model relation. */
    String el() default "";

    /** The id of the overarch model relation. */
    String id() default "";

    /** The id of the referring node of the overarch model relation. */
    String from() default "";

    /** The id of the referred node of the overarch model relation. */
    String to() default "";

    /** The name of the overarch model relation. */
    String name() default "";
    
    /** The description of the overarch model relation. */
    String desc() default "";

    /** The technology of the overarch model relation. */
    String tech() default "";

    /** The tags of the overarch model relation. */
    String[] tags() default {};

    /** An EDN map with additional attribute value sof the overarch model relation. */
    String edn() default "";
}
