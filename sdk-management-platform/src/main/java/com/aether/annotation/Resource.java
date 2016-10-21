package com.aether.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author liuyang
　* @date 创建时间：2016年10月8日 上午10:07:49
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Resource {

    boolean login() default true;
    String value() default "";
}
