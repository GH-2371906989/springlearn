package com.gu.cn;

import java.lang.annotation.*;

//该注解可以应用于类、接口（包括注解类型）、枚举
@Target(ElementType.TYPE)
//该注解标记的元素可以被Javadoc 或类似的工具文档化
@Documented
//该注解的生命周期，由JVM 加载，包含在类文件中，在运行时可以被获取到
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemConfig {
    String name() default "lin";
    int age();
}

