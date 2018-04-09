package com.example.demo.aop;

import java.lang.annotation.*;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：16:31
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
