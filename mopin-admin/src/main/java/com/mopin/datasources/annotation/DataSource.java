package com.mopin.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author jerry
 * @email  jerry.li@mopinlive.com
 * @date 2018/9/16 22:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
