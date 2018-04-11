package com.app.demo.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by cool on 2018/4/11.
 */
@Retention(CLASS)
@Target(TYPE)
public @interface Inject {
}
